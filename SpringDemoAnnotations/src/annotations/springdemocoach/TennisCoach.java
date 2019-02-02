package annotations.springdemocoach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "30 mins of tennis practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
