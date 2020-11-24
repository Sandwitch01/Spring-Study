import com.xiao.Host;
import com.xiao.Proxy;

public class MyTest {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy=new Proxy(host);
        proxy.rent();
    }
}
