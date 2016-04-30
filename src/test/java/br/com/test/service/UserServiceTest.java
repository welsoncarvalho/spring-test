package br.com.test.service;

import br.com.test.exception.BusinessException;
import br.com.test.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by welson on 30/04/16.
 */
public class UserServiceTest extends AbstractServiceTest {

    private static final Long REGISTRY_ALREADY_EXISTS = 1111L;

    private static final String NEW_NAME = "New User";
    private static final String NEW_BIRTHDATE = "01/01/1990";
    private static final Long NEW_REGISTRY = 3333L;

    @Autowired
    private UserService userService;

    @Test(expected = BusinessException.class)
    public void testRegistryAlreadyExists() {
        User user = buildNewUser();
        user.setRegistry(REGISTRY_ALREADY_EXISTS);

        userService.save(user);
    }

    @Test
    public void testSave() {
        User user = buildNewUser();
        userService.save(user);

        Assert.assertNotNull(user.getId());
    }

    private User buildNewUser() {
        User user = new User();
        user.setName(NEW_NAME);
        user.setRegistry(NEW_REGISTRY);
        user.setBirthDate(getBirthDate());

        return user;
    }

    private Date getBirthDate() {
        Date birthDate = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            birthDate = sdf.parse(NEW_BIRTHDATE);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return birthDate;
    }

}
