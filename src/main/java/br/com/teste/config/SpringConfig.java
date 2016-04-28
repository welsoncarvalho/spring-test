package br.com.teste.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by welson on 25/04/16.
 */
@Configuration
@ComponentScan(basePackages = {"br.com.teste"})
@Import(SpringJpaConfig.class)
public class SpringConfig {

}
