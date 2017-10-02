package pl.pawel.service;

import org.springframework.stereotype.Service;

/**
 * Created by Pawel on 2017-10-02.
 */
@Service
public class GetterGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hello - I was injected by the getter";
	}
}
