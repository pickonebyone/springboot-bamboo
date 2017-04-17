package com.kuyun.bamboo.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by songzj on 2017/3/29.
 */
@Configuration(value = "application.properties")
//@TestConfiguration
public class DataSourceConfig {

    @Bean(name = "dataSource", destroyMethod = "close", initMethod = "init")
    @ConfigurationProperties(prefix = "spring.datasource")

    public DruidDataSource dataSource() {
        return new DruidDataSource();
    }
}
