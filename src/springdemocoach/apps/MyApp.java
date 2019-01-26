package springdemocoach.apps;

import springdemocoach.Coach;
import springdemocoach.FortuneService;
import springdemocoach.HappyFortuneService;
import springdemocoach.TrackCoach;

public class MyApp {

    public static void main(String[] args) {
        FortuneService fortuneService = new HappyFortuneService();

        Coach theCoach = new TrackCoach(fortuneService);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
    }


}
