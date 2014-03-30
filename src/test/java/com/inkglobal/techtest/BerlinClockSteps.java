package com.inkglobal.techtest;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;


public class BerlinClockSteps {

    private final Clock clock;
    private String result;

    public BerlinClockSteps() {
        this.clock = new Clock(new BerlinFace());
    }

    @Given("an input of $input")
    public void inputIs(final String input) {
        clock.setInput(input);
    }

    @When("the berlinclock is displayed")
    public void theBerlinClockIsDisplayed() {
        this.result = this.clock.display();

    }

    @Then("the result is $result")
    public void assertResultIs(final String result) {
        assertThat(this.result, equalTo(result));
    }


}
