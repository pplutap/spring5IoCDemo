package pl.pawel.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Pawel on 2017-10-02.
 */
@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hello - Primary Greeting service";
	}
}
