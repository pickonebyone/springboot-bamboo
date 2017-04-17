package com.kuyun.bamboo;

import com.kuyun.bamboo.module.TbFtpFile;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.test.context.transaction.BeforeTransaction;

/**
 * Created by songzj on 2017/4/14.
 */
@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = {"com.kuyun.bamboo.mapper"})
public class Application {

    @Autowired
    TbFtpFile tbFtpFile;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public TbFtpFile tbFtpFile(){
        return new TbFtpFile();
    }

}
