package com.bdd.demo.definition;

import com.bdd.demo.FizzBuzz;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzStepdefs {
    String result;

    @When("user enters {int}")
    public void userEnters(int input) {
        FizzBuzz fb = new FizzBuzz();
        result = fb.input(input);
    }

    @When("user enters {string}")
    public void userEnters(String input) {
        FizzBuzz fb = new FizzBuzz();
        result = fb.input(Integer.parseInt(input));
    }

    @Then("response from FizzBuzz is {string}")
    public void responseFromFizzBuzzIsFizz(String expected) {
        assertEquals(expected,result);
    }


}
