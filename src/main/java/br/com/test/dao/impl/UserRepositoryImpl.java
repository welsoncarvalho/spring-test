package br.com.test.dao.impl;

import br.com.test.dao.UserRepositoryCustom;
import br.com.test.model.User;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by welson on 29/05/16.
 */
public class UserRepositoryImpl extends BaseRepositoryImpl<User, Long> implements UserRepositoryCustom {

    public UserRepositoryImpl() {
        super(User.class);
    }

    @Override
    public List<User> findByFilter(User filter) {

        Map<String, Object> parameters = new HashMap<>();

        StringBuilder hql = new StringBuilder();
        hql.append("From User u where 1 = 1 ");

        addFilter(hql, parameters, filter);

        return findByParameters(hql, parameters);
    }

    private void addFilter(StringBuilder hql, Map<String, Object> parameters, User filter) {

        if(!StringUtils.isEmpty(filter.getName())) {
            hql.append("and u.name like :name ");
            parameters.put("name", "%" + filter.getName() + "%");
        }

        if(filter.getId() != null) {
            hql.append("and u.id = :id ");
            parameters.put("id", filter.getId());
        }

    }
}
