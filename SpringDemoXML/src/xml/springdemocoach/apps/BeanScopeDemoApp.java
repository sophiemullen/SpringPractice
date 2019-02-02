package xml.springdemocoach.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.springdemocoach.Coach;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/beanScope-applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = coach == alphaCoach;

        System.out.println("Poiting to the same object: " + result);
        System.out.println("Memory location for coach: " + coach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);

        context.close();
    }
}
