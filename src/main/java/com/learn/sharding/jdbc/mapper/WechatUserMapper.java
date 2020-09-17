package com.learn.sharding.jdbc.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learn.sharding.jdbc.model.WechatUser;
import org.springframework.stereotype.Repository;


@Repository
public interface WechatUserMapper extends BaseMapper<WechatUser> {

}