package annotations.springdemocoach;

import annotations.springdemocoach.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {

    private FortuneService fortuneService;

    public RugbyCoach() {
        System.out.println("Inside the default constructor: rugby");
    }

    @Autowired
    public void setFortuneService(@Qualifier("happyFortuneService") FortuneService fortuneService) {
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
