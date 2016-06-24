package br.com.test.dao;

import br.com.test.model.User;

import java.util.List;

/**
 * Created by welson on 29/05/16.
 */
public interface UserRepositoryCustom {

    List<User> findByFilter(User filter);

}
