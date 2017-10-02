package pl.pawel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.pawel.service.GreetingService;

/**
 * Created by Pawel on 2017-10-02.
 */
@Controller
public class GetterInjectedController {
	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	@Qualifier("getterGreetingService")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
