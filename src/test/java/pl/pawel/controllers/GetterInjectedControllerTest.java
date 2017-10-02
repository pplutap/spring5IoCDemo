package pl.pawel.controllers;

import org.junit.Before;
import org.junit.Test;
import pl.pawel.service.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by Pawel on 2017-10-02.
 */
public class GetterInjectedControllerTest {

	private GetterInjectedController getterInjectedController;

	@Before
	public void setUp() throws Exception {
		this.getterInjectedController = new GetterInjectedController();
		this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.GREETING, getterInjectedController.sayHello());
	}
}
