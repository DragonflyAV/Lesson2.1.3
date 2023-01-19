import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat catbean = (Cat) applicationContext.getBean("cat");
        Cat catbean2 = (Cat) applicationContext.getBean("cat");

        boolean helloWorld = bean == bean2;
        boolean cat = catbean == catbean2;

        System.out.println(helloWorld);
        System.out.println(cat);

    }
}