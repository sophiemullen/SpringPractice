package springdemocoach.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemocoach.domain.CricketCoach;

public class SetterDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        context.close();
    }
}
