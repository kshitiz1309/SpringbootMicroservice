package com.example.SpringBootAnnotations.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "db.active",havingValue = "true")
public class DbConfig {

    @Bean
    public DbDataSource dbDataSource(){
        return new DbDataSource();
    }
}
