package springdemocoach.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] randomFortunes = {
            "You are going to have a great day",
            "Better make sure you have a bottle of wine in the fridge",
            "Now is the perfect time to learn something new"};

    @Override
    public String getFortune() {
        Random random = new Random();

        int randomIndex = random.nextInt(randomFortunes.length);
        return randomFortunes[randomIndex];
    }
}
