package com.kuang.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test09 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        Class c1 = Class.forName("com.kuang.reflection.User");

        //构造一个对象
        //User user = (User) c1.newInstance();
        //System.out.println(user);

        //通过构造器创建一个对象
        //Constructor constructor = c1.getDeclaredConstructor(String.class,int.class,int.class);
        //User user2 = (User) constructor.newInstance("ykz",15,11);
        //System.out.println(user2);

        //通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        //通过反射获得一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke:激活的意思
        //invoke(对象,"方法的值") 意思为通过反射user3对象的setName方法并传入参数
        setName.invoke(user3,"ykz");
        System.out.println(user3.getName());

        //通过反射操作属性
        System.out.println("=======================");
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        //不能直接操作私有属性，我们需要关闭程序的安全检测，属性或者方法的setAccessible(true)
        name.setAccessible(true);
        name.set(user4, "ykzzzzzz");
        System.out.println(user4.getName());

    }
}
