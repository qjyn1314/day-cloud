package com.day.yesterday;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableDubbo
@ComponentScan("com.day")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DayYesterdayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DayYesterdayApplication.class, args);
    }

}
