package pl.pawel.controllers;

import org.springframework.stereotype.Controller;
import pl.pawel.service.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Print hello");

		return greetingService.sayGreeting();
	}
}
