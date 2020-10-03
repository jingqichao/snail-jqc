package com.jqc.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TestShardingJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestShardingJdbcApplication.class, args);
    }
}
