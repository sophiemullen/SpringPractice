package annotations.springdemocoach.app;

import annotations.SportConfig;
import annotations.springdemocoach.domain.Coach;
import annotations.springdemocoach.domain.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.getEmailAddress());
        System.out.println(swimCoach.getTeam());

        context.close();
    }
}
