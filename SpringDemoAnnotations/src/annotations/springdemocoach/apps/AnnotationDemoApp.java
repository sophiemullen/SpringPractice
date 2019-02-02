package annotations.springdemocoach.apps;

import annotations.springdemocoach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");

        Coach rugbyCoach = context.getBean("rugbyCoach", Coach.class);

        System.out.println(rugbyCoach.getDailyWorkout());
        System.out.println(rugbyCoach.getDailyFortune());

        context.close();
    }
}
