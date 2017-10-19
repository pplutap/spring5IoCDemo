package pl.pawel.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreeringService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Servicio de Saludo Primario";
	}
}
