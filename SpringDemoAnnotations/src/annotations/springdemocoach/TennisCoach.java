package annotations.springdemocoach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "30 mins of tennis practice";
    }

    @Override
    public String getDailyFortune() {
        return "Tennis coach fortune";
    }
}
