import com.kuang.pojo.hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        hello hello = (hello)context.getBean("hello");
        System.out.println(hello.getStr());
    }
}
