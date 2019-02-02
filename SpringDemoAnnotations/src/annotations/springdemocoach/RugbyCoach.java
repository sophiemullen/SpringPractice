package annotations.springdemocoach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component
public class RugbyCoach implements Coach {

    private FortuneService fortuneService;

    public RugbyCoach() {
        System.out.println("Inside the default constructor: rugby");
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your throws";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
