package com.learn.sharding.jdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learn.sharding.jdbc.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
