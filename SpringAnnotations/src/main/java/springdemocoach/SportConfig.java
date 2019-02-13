package springdemocoach;

import springdemocoach.domain.Coach;
import springdemocoach.domain.SwimCoach;
import springdemocoach.service.FortuneService;
import springdemocoach.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("springdemocoach") // not needed for swim demo app
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
//        Gives a reference to the bean, and Spring will intercept and give us a
//        reference to the corresponding object based on the bean scope
    }
}
