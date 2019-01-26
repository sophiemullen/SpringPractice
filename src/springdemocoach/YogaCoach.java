package springdemocoach;

public class YogaCoach implements Coach {

    private FortuneService fortuneService;

    public YogaCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Ashtanga all day everyday";
    }

    @Override
    public String getDailyFortune() {
        return "Namaste: " + fortuneService.getFortune();
    }
}
