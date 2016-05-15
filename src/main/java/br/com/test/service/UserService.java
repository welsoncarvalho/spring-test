package br.com.test.service;

import br.com.test.model.User;

import java.util.List;

/**
 * Created by welson on 25/04/16.
 */
public interface UserService {

    void save(User user);

    List<User> list();

}
