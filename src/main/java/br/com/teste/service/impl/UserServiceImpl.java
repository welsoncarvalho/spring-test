package br.com.teste.service.impl;

import br.com.teste.dao.UserRepository;
import br.com.teste.model.User;
import br.com.teste.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by welson on 25/04/16.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

}
