Feature: Develop a RPNCalculator REST API

This RPNCalculator REST API will accept a math expression in
post-fix a.k.a Reverse Polish Notation and evaluates and returns the result. 

	Scenario: Simple Addition

 	Given The REST API is up and live
	And the rest endpoint is: "http://localhost:8080/rpncalculator/10 15 +"
	When I invoke the rest endpoint URL
	Then I expect the result as "25.0"

	