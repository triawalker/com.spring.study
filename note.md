##常用依赖

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.3.5</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
            <scope>test</scope>
        </dependency>
 ##注解说明  
   
 <context:component-scan base-package="com.kuang"/>  
 <context:annotation-config/>  
   
 @Autowired:自动装配通过类型、名字  
    如果Autowired不能唯一自动装配上属性，则需要@Qualifier(value = "cat111")  
 @Resource:自动装配通过名字、类型  
 ======================  
 @Component 有几个衍生注解 在web开发中，按照mvc三层架构分层。注入beans中  
 dao[@Repository]  
 service[@Service]  
 controller[@Controller]  
 ======================  
 @Scope:单例模式 多例模式注解  
 @Scope(value = "singleton")  
 @Scope(value = "prototype")  