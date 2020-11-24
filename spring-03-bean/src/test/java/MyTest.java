import com.school.Student;
import com.school.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

    }
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
//        User user = (User) context.getBean("user");
//        System.out.println(user.toString());
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user.toString());
        System.out.println(user == user2);
    }
}
