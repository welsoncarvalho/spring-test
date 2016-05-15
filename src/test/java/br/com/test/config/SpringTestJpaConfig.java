package br.com.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by welson on 28/04/16.
 */
@EnableJpaRepositories(basePackages = {"br.com.test.dao"})
@EnableTransactionManagement
public class SpringTestJpaConfig extends  SpringJpaConfig {

    @Value("classpath:scripts/insert_funcionality.sql")
    private Resource dataScript;

    @Bean
    public DataSourceInitializer dataSourceInitializer() {
        DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(dataSource());

        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(dataScript);

        initializer.setDatabasePopulator(populator);

        return initializer;
    }

}
