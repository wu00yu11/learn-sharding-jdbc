package com.learn.sharding.jdbc.service;

import com.learn.sharding.jdbc.dao.HelloDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wu00y
 */
@Service
@Slf4j
public class HelloServiceImpl implements HelloService {

    @Resource
    private HelloDao helloDao;

    @Override
    public void sayHello() {
        log.info("say hello to you!");
    }
}
