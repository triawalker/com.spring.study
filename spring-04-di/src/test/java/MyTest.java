import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());*/
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
        User user = context.getBean("user2",User.class);
        System.out.println(user.hashCode());
        user = context.getBean("user2",User.class);
        System.out.println(user.hashCode());
        System.out.println(user.toString());


    }
}
