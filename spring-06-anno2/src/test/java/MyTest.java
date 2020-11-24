import com.SpringConf;
import com.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);
        User user = context.getBean("gUser", User.class);
        System.out.println(user.getName());
    }
}
