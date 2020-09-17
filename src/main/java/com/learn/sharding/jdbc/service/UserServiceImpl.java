package com.learn.sharding.jdbc.service;

import com.learn.sharding.jdbc.mapper.UserApplicationMapper;
import com.learn.sharding.jdbc.mapper.UserMapper;
import com.learn.sharding.jdbc.model.User;
import com.learn.sharding.jdbc.model.UserApplication;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author jingjing.zhang
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserApplicationMapper userApplicationMapper;
    @Override
    public void save() {
        for (int i = 0; i < 1000; i++) {
            User u = new User();
            u.setAvatar("");
            u.setCreateTime(new Date());
            u.setId(101+i);
            u.setMobile("1111111111111");
            u.setNickname("111111111111");
            u.setStatus(1);
            u.setUid(DigestUtils.md5Hex("" + System.currentTimeMillis() + gen()));
            userMapper.insert(u);
            UserApplication userApplication =new UserApplication();
            BeanUtils.copyProperties(u,userApplication);
            userApplicationMapper.insert(userApplication);
        }
    }

    private String gen() {
        return String.valueOf(Math.random() * 3).substring(2, 6);
    }
}
