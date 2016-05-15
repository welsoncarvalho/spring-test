package br.com.test.service;

import br.com.test.config.SpringTestConfig;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by welson on 30/04/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringTestConfig.class)
public abstract class AbstractServiceTest {

    protected Logger getLogger() {
        return LoggerFactory.getLogger(getClass());
    }

}
