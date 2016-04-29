package br.com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by welson on 28/04/16.
 */
@Configuration
@ComponentScan(basePackages = {"br.com.test"})
@Import(SpringTestJpaConfig.class)
public class SpringTestConfig {

}
