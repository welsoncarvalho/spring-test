package br.com.teste.service;

import br.com.teste.config.SpringConfig;
import br.com.teste.model.Funcionality;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by welson on 25/04/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class FuncionalityServiceTest {

    @Autowired
    private FuncionalityService funcionalityService;

    @Before
    public void init() {
        Funcionality funcionality = new Funcionality();
        funcionality.setName("Users");

        funcionalityService.save(funcionality);
    }

    @Test
    public void testList() {
        List<Funcionality> listFuncionality = funcionalityService.list();
        Assert.assertTrue(listFuncionality.size() > 0);
    }

}
