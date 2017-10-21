package pl.pawel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import pl.pawel.repository.GreetingRepository;
import pl.pawel.service.GreetingService;
import pl.pawel.service.GreetingServiceFactory;

/**
 * Created by Pawel on 2017-10-21.
 */
@Configuration
public class GreetingServiceConfig {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
		return new GreetingServiceFactory(repository);
	}

	@Bean
	@Primary
	@Profile({"en", "default"})
	GreetingService primaryGreetingService(GreetingServiceFactory factory) {
		return factory.createGreetingService("en");
	}

	@Bean
	@Primary
	@Profile("de")
	GreetingService primaryGermanGreetingService(GreetingServiceFactory factory) {
		return factory.createGreetingService("de");
	}

	@Bean
	@Primary
	@Profile("es")
	GreetingService primarySpanishGreetingService(GreetingServiceFactory factory) {
		return factory.createGreetingService("es");
	}
}
