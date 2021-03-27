package com.kuang.reflection;

public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
        /*
        * 1.加载到内存张，会产生一个类对应的Class对象
        * 2.链接，链接结束后m=0
        * 3.初始化
        * <clinit>(){ //编译器手机所有类中所有类变量的赋值动作和静态代码块中的语句合并产生
        *   sop("A类静态代码块初始化")
        *   m = 300;
        *   m=100;
        * }
        *
        *
        * */
    }
}
class A{

    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }
    static int m = 100;
    public A(){
        System.out.println("A类的无参构造初始化");
    }
}
