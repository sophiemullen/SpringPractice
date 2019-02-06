package xml.springdemocoach.domain;

import xml.springdemocoach.service.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void doStartupStuff() {
        System.out.println("TrackCoach: inside method doStartupStuff");
    }

    public void doCleanupStuff() {
        System.out.println("TrackCoach: inside method doCleanupStuff");
    }
}
