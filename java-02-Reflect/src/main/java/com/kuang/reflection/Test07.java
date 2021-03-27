package com.kuang.reflection;

import sun.awt.geom.AreaOp;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //获取系统类加载器父类加载器->扩展加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //获取扩展类的父类加载器->根加载器(C/C++)
        ClassLoader grandparent = parent.getParent();
        System.out.println(grandparent);
        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.kuang.reflection.Test07").getClassLoader();
        System.out.println(classLoader);
        //测试JDK内置类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);
        //如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        /*
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\charsets.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\com.jcraft.jsch-all-1.0.0.release.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\commons-net-3.7.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\deploy.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\access-bridge-64.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\cldrdata.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\dnsns.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jaccess.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jfxrt.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\localedata.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\nashorn.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunec.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunjce_provider.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunmscapi.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunpkcs11.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\zipfs.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\javaws.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\jce.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfr.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfxswt.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\jsse.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\management-agent.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\plugin.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\resources.jar;
        * C:\Program Files\Java\jdk1.8.0_191\jre\lib\rt.jar;
        * D:\.MyDesktop\Spring\com.spring.study\java-02-Reflect\target\classes;
        * D:\.Maven\repository\org\springframework\spring-context\5.3.5\spring-context-5.3.5.jar;
        * D:\.Maven\repository\org\springframework\spring-aop\5.3.5\spring-aop-5.3.5.jar;
        * D:\.Maven\repository\org\springframework\spring-beans\5.3.5\spring-beans-5.3.5.jar;
        * D:\.Maven\repository\org\springframework\spring-core\5.3.5\spring-core-5.3.5.jar;
        * D:\.Maven\repository\org\springframework\spring-jcl\5.3.5\spring-jcl-5.3.5.jar;
        * D:\.Maven\repository\org\springframework\spring-expression\5.3.5\spring-expression-5.3.5.jar;
        * C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.1\lib\idea_rt.jar
        * */

    }
}
