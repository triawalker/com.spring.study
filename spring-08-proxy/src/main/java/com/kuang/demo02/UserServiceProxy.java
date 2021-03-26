package com.kuang.demo02;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
        log("add");
    }

    @Override
    public void delete() {
        userService.delete();
        log("delete");
    }

    @Override
    public void update() {
        userService.update();
        log("update");
    }

    @Override
    public void query() {
        userService.query();
        log("query");
    }

    public void log(String log){
        System.out.println("[log]"+log);
    }
}
