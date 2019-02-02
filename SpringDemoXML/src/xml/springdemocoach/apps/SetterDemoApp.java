package xml.springdemocoach.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.springdemocoach.CricketCoach;

public class SetterDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/applicationContext.xml");

        CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        context.close();
    }
}
