package com.aiminding.study.demo.db;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class TransactionConfiguration {

    @Primary
    @Bean
    public PlatformTransactionManager platformTransactionManager(
            @Qualifier("dataSource") DataSource dataSource) {
        return buildTransactionManager(dataSource);
    }

    private PlatformTransactionManager buildTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(dataSource);
        return manager;
    }
}