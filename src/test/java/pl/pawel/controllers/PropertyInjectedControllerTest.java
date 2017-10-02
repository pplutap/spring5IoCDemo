package pl.pawel.controllers;

import org.junit.Before;
import org.junit.Test;
import pl.pawel.service.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by Pawel on 2017-10-02.
 */
public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectedController;

	@Before
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.GREETING, propertyInjectedController.sayHello());
	}
}
