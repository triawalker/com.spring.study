package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//这个也会Spring容托管，注册到容器种，因为他本来角色应该@Component
//@Configuration代表这是一个配置类，就和我们之前看的beans.xml
@Configuration
@ComponentScan("com.kuang.pojo")
@Import(KuangConfig2.class)
public class KuangConfig {
    //注册一个bean,就相当于我们之前写的一个bean标签
    //通过这方法的名字，就相当于bean标签种的id属性
    //这个方法的放回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();
    }
}
