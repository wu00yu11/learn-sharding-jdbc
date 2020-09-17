package com.learn.sharding.jdbc.controller;

import com.learn.sharding.jdbc.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wu00y
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {
    @Resource
    private HelloService helloService;
}
