package annotations.springdemocoach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonalTrainer implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public PersonalTrainer(FortuneService fortuneService) {
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
