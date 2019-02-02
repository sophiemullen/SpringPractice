package annotations.springdemocoach.app;

import annotations.springdemocoach.Coach;
import annotations.springdemocoach.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");

        Coach personalTrainer = context.getBean("personalTrainer", Coach.class);
        Coach personalTrainer2 = context.getBean("personalTrainer", Coach.class);

        boolean result = (personalTrainer == personalTrainer2);

        System.out.println("Poiting to the same object: " + result);
        System.out.println("Memory location for personal trainer 1: " + personalTrainer.toString());
        System.out.println("Memory location for personal trainer 2: " + personalTrainer2.toString());

        context.close();
    }
}
