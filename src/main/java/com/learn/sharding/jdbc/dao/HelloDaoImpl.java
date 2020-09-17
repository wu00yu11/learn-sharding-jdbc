package com.learn.sharding.jdbc.dao;

import com.learn.sharding.jdbc.mapper.HelloMapper;
import com.learn.sharding.jdbc.model.Hello;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author wu00y
 */
@Repository
@Slf4j
public class HelloDaoImpl implements HelloDao {

    @Resource
    private HelloMapper helloMapper;

    @Override
    public void save(Hello hello) {
        helloMapper.save(hello);
    }
}
