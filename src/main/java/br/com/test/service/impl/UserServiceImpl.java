package br.com.test.service.impl;

import br.com.test.dao.UserRepository;
import br.com.test.exception.BusinessException;
import br.com.test.model.User;
import br.com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by welson on 25/04/16.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        checkUserRegistry(user);
        userRepository.save(user);
    }

    private void checkUserRegistry(User user) {
        if(userRepository.findByRegistry(user.getRegistry()) != null) {
            throw new BusinessException("Already exist user registry");
        }
    }

    public List<User> list() {
        return userRepository.findAll();
    }
}
