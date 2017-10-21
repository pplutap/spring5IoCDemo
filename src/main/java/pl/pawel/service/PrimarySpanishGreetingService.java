package pl.pawel.service;

import pl.pawel.repository.GreetingRepository;

public class PrimarySpanishGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getSpanishGreeting();
	}
}
