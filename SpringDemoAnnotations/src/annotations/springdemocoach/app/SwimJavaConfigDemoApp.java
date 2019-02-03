package annotations.springdemocoach.app;

import annotations.SportConfig;
import annotations.springdemocoach.domain.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach swimCoach = context.getBean("swimCoach", Coach.class);

        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());

        context.close();
    }
}
