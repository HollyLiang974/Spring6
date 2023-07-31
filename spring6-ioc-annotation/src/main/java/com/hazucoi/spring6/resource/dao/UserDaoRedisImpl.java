package com.hazucoi.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository(value ="myUserDaoRedisImpl" )
public class UserDaoRedisImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("Redis Dao层执行结束");
    }
}
