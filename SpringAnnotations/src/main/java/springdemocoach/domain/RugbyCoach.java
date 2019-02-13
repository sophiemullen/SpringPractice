package springdemocoach.domain;

import springdemocoach.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PostConstruct
    public void doOnInit(){
        System.out.println("Inside rugbyCoach init method");
    }

    @PreDestroy
    public void doOnDestroy(){
        System.out.println("Inside rugbyCoach destroy method");
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
