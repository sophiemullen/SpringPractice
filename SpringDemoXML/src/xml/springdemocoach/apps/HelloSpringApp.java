package xml.springdemocoach.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.springdemocoach.Coach;

public class HelloSpringApp {

    public static void main(String[] args) {
        // Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/applicationContext.xml");

        // Retrieve the bean from the spring container
        Coach myCoach = context.getBean("myCoach", Coach.class);

        // Call methods
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
