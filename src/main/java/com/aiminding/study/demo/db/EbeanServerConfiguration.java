package com.aiminding.study.demo.db;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.ebean.Database;
import io.ebean.DatabaseFactory;
import io.ebean.config.DatabaseConfig;
import io.ebean.config.UnderscoreNamingConvention;
import io.ebean.spring.txn.SpringJdbcTransactionManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * ebean配置
 */
@Configuration
@Slf4j
@AutoConfigureAfter(DataSourceConfiguration.class)
public class EbeanServerConfiguration {

    @Resource(name = "dbCustomObjectMapper")
    private ObjectMapper mapper;


    @Primary
    @Bean
    public Database eBeanServer(
            @Qualifier("dataSource") DataSource dataSource) {
        return buildEBeanServer("task-service", dataSource);
    }

    private Database buildEBeanServer(String name, DataSource dataSource) {
        log.info("init EBean server named:{},url:{}", name, dataSource.toString());
        DatabaseConfig databaseConfig = new DatabaseConfig();
        databaseConfig.setName(name);
        databaseConfig.setDataSource(dataSource);
        databaseConfig.setObjectMapper(mapper);
        databaseConfig.setExternalTransactionManager(new SpringJdbcTransactionManager());
        databaseConfig.setNamingConvention(new UnderscoreNamingConvention());
        return DatabaseFactory.create(databaseConfig);
    }

}
