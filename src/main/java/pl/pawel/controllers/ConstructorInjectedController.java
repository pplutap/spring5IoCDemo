package pl.pawel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.pawel.service.GreetingService;

/**
 * Created by Pawel on 2017-10-02.
 */
@Controller
public class ConstructorInjectedController {
	private GreetingService greetingService;

	@Autowired
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
