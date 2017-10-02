package pl.pawel.service;

import org.springframework.stereotype.Service;

/**
 * Created by Pawel on 2017-10-02.
 */
@Service
public class GreetingServiceImpl implements GreetingService {
	public static String GREETING = "You did it, super";

	@Override
	public String sayGreeting() {
		return "Hello";
	}
}
