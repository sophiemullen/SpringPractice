package annotations.springdemocoach.app;

import annotations.springdemocoach.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");

        TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
        System.out.println(tennisCoach.getEmailAddress());
        System.out.println(tennisCoach.getTeam());

        context.close();
    }
}
