package com.kuang.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("默认调用SQL");
    }
}
