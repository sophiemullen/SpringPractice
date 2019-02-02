package xml.springdemocoach.apps;

import xml.springdemocoach.Coach;
import xml.springdemocoach.FortuneService;
import xml.springdemocoach.HappyFortuneService;
import xml.springdemocoach.TrackCoach;

public class MyApp {

    public static void main(String[] args) {
        FortuneService fortuneService = new HappyFortuneService();

        Coach theCoach = new TrackCoach(fortuneService);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
    }


}
