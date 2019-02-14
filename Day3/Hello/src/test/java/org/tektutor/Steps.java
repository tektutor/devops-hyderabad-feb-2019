package org.tektutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import cucumber.api.PendingException;

import static org.junit.Assert.*;

public class Steps {

	private App app;
	String actualResponse; 

	@Given("^There is a class called App$")
	public void there_is_a_class_called_App() throws Exception {
		app = new App();
	}

	@When("^I invoke the sayHello method$")
	public void i_invoke_the_sayHello_method() throws Exception {
		actualResponse = app.sayHello();
	}

	@Then("^I expected a response \"([^\"]*)\"$")
	public void i_epxected_a_response(String expectedResponse) throws Exception {
		assertEquals ( expectedResponse, actualResponse );
	}


}
