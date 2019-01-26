package springdemocoach.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemocoach.RandomCoach;

public class RandomApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        RandomCoach coach = context.getBean("randomCoach", RandomCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
