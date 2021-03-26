package com.kuang.demo02;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add operation");
    }

    @Override
    public void delete() {
        System.out.println("delete operation");
    }

    @Override
    public void update() {
        System.out.println("update operation");
    }

    @Override
    public void query() {
        System.out.println("query operation");
    }
}
