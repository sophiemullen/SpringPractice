package xml.springdemocoach.apps;

import xml.springdemocoach.domain.Coach;
import xml.springdemocoach.service.FortuneService;
import xml.springdemocoach.service.HappyFortuneService;
import xml.springdemocoach.domain.TrackCoach;

public class MyApp {

    public static void main(String[] args) {
        FortuneService fortuneService = new HappyFortuneService();

        Coach theCoach = new TrackCoach(fortuneService);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
    }


}
