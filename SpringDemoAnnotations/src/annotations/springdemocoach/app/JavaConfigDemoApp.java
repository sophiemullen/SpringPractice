package annotations.springdemocoach.app;

import annotations.SportConfig;
import annotations.springdemocoach.domain.TennisCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        TennisCoach swimCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());

        context.close();
    }
}
