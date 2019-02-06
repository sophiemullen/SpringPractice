package xml.springdemocoach.service;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "You will be happy today";
    }
}
