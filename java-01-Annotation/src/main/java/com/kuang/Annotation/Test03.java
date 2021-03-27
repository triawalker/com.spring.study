package com.kuang.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test03 {
    @MyAnnotation2(name = "ykz",schools = {"绍兴文理学员元培学院","越秀外国语学院"})
    public void test(){

    }
    @MyAnnotation
    public void test2(){

    }
}
@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解参数：参数类型+参数名();
    String name() ;
    int age() default 0;
    int id() default -1;//如果默认值为-1，代表不存在
    String[] schools();
}
@interface MyAnnotation3{
    //只有一个注解且为value可以为空
    String value();
}
