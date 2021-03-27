package com.kuang.reflection;

public class Test06 {
    static {
        System.out.println("Main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用
        //Son son = new Son();
        //反射也会产生主动引用
        //Class.forName("com.kuang.reflection.Son");

        //调用子类继承父类中的静态变量b会使父类初始化
        //System.out.println(Son.b);
        //定义子类数组不会使子父类初始化，数组只是开辟了内存空间
        //Son[] array = new Son[5];
        //调用子类中的变量不会使子类初始化
        System.out.println(Son.M);
    }
}
class Father{
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}
class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static int m = 100;
    static final int M = 1;
}
