package springdemocoach.domain;

import springdemocoach.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Inside the default constructor: tennisCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "30 mins of tennis practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
