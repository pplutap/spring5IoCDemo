package pl.pawel.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.pawel.service.GreetingService;

/**
 * Created by Pawel on 2017-10-02.
 */
@Controller
public class ConstructorInjectedController {
	private GreetingService greetingService;


	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
