package br.com.test.service.impl;

import br.com.test.dao.UserRepository;
import br.com.test.exception.BusinessException;
import br.com.test.model.User;
import br.com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

        Optional<User> userOptional = Optional.ofNullable(userRepository.findByRegistry(user.getRegistry()));
        userOptional.ifPresent(u -> {
            throw new BusinessException("User " + user.getRegistry() + " already exists");
        });

    }

    public List<User> list() {
        return userRepository.findAll();
    }
}
