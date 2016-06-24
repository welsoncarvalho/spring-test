package br.com.test.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * Created by welson on 29/05/16.
 */
public class BaseRepositoryImpl<T, I> {

    @PersistenceContext(name = "SPRING-TEST-PU")
    private EntityManager entityManager;

    private Class<?> clazz;

    protected BaseRepositoryImpl(Class<?> clazz) {
        this.clazz = clazz;
    }

    protected List<T> findByParameters(StringBuilder hql, Map<String, Object> parameters) {
        return findByParameters(hql.toString(), parameters);
    }

    protected List<T> findByParameters(String hql, Map<String, Object> parameters) {
        Query query = getEntityManager().createQuery(hql.toString());
        setMapParametersOnQuery(query, parameters);
        return query.getResultList();
    }

    protected void setMapParametersOnQuery(Query query, Map<String, Object> parameters) {
        if(parameters != null) {
            for(String key : parameters.keySet()) {
                query.setParameter(key, parameters.get(key));
            }
        }
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
