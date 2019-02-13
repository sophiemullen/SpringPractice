package springdemocoach.service;

import org.springframework.stereotype.Component;

@Component("restFortuneService")
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
