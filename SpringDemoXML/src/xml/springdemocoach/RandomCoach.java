package xml.springdemocoach;

public class RandomCoach implements Coach {

    private RandomFortuneService fortuneService;

    public RandomCoach(RandomFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Something random";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
