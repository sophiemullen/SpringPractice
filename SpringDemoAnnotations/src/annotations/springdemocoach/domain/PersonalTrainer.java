package annotations.springdemocoach.domain;

import annotations.springdemocoach.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PersonalTrainer implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public PersonalTrainer(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Inside the default constructor: personal trainer");
    }

    @Override
    public String getDailyWorkout() {
        return "Life weights for 30 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
