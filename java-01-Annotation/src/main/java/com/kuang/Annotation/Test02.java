package com.kuang.Annotation;

import java.lang.annotation.*;

@MyAnnotation
public class Test02 {
    @MyAnnotation
    public void test(){

    }
}

//定义一个注解
//Target表示我们的注解可以用在什么地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})

//Retention表示我们的地方在上面地方还有效果 RUNTIME>CLASS>SOURCES
@Retention(value = RetentionPolicy.RUNTIME)

//Documented 表示是否将我们的注解生成在JAVAdoc中
@Documented

//Inherited 表示子类可以继承父类中的该注解
@Inherited

@interface  MyAnnotation{

}
