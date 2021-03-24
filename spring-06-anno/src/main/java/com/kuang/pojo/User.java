package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于<bean name="user" class="com.kuang.pojo.User"/>
@Component
public class User {
    //等价于<property name="name" value="YKZ2"/>
    @Value("YKZ2")
    public String name = "ykz";
}
