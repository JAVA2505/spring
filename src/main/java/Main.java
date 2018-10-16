import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Sayer s = (Sayer) context.getBean("sayer");//new Sayer("Hello");
        s.say();
    }
}
