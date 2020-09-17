package com.learn.sharding.jdbc.mapper;

import com.learn.sharding.jdbc.model.Hello;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wu00y
 */
@Mapper
public interface HelloMapper {
    /**
     * @param hello
     */
    void save(Hello hello);
}
