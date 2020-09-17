package com.learn.sharding.jdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wu00y
 */
@MapperScan("com.learn.sharding.jdbc.mapper")
@SpringBootApplication
public class LearnShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnShardingJdbcApplication.class, args);
    }

}
