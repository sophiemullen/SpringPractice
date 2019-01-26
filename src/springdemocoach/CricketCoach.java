package springdemocoach;

public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Cricket coach constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach setter method");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Email address setter");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Team setter");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practing fast bowling";
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
