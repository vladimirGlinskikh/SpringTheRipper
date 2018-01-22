package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vladimir Glinskikh on 22.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        while (true) {
            Thread.sleep(1000);
            context.getBean(Quoter.class).sayQuote();
        }
    }
}
