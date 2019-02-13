package springdemocoach.app;

import springdemocoach.domain.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationLifecycleDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach rugbyCoach = context.getBean("rugbyCoach", Coach.class);

        context.close();
    }
}
