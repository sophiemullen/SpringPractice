package annotations.springdemocoach;

import annotations.springdemocoach.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Value("${file.email}")
    private String emailAddress;

    @Value("${file.team}")
    private String team;

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

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
