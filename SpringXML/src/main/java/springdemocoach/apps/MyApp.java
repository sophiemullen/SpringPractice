package springdemocoach.apps;

import springdemocoach.domain.Coach;
import springdemocoach.service.FortuneService;
import springdemocoach.service.HappyFortuneService;
import springdemocoach.domain.TrackCoach;

public class MyApp {

    public static void main(String[] args) {
        FortuneService fortuneService = new HappyFortuneService();

        Coach theCoach = new TrackCoach(fortuneService);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
    }


}
