Feature: Develop a simple Hello world application in Java
 
	Scenario: Should be able to invoke sayHello method
		
		Given There is a class called App
		When I invoke the sayHello method
		Then I expected a response "Hello DevOps!"
