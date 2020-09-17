package com.learn.sharding.jdbc.dao;

import com.learn.sharding.jdbc.model.Hello;

/**
 * @author wu00y
 */
public interface HelloDao {

    /**
     * @param hello
     */
    void save(Hello hello);
}
