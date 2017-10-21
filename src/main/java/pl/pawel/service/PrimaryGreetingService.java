package pl.pawel.service;

import pl.pawel.repository.GreetingRepository;

/**
 * Created by Pawel on 2017-10-02.
 */
public class PrimaryGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getEnglishGreeting();
	}
}
