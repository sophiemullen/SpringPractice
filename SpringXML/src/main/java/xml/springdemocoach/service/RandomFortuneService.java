package xml.springdemocoach.service;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] randomFortunes = {"This is your lucky day", "Beware of number 13", "Watch out for the colour red"};

    @Override
    public String getFortune() {
        Random random = new Random();

        int randomIndex = random.nextInt(randomFortunes.length);
        return randomFortunes[randomIndex];
    }
}
