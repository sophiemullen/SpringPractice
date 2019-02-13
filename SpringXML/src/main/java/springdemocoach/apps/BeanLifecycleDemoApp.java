package springdemocoach.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemocoach.domain.Coach;

public class BeanLifecycleDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
