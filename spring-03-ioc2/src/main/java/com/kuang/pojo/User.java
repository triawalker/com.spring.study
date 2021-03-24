package com.kuang.pojo;

public class User {
    private String name;
    private int age;

    public User(String name){
        this.name = name;
        System.out.println("name:"+this.name);
    }

    public User(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(name+" is "+age+" years old");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name:"+name);
    }
}
