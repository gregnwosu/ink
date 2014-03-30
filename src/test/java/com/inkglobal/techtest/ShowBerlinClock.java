package com.inkglobal.techtest;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShowBerlinClock extends JUnitStory {

    private final Clock clock;
    private String result;

    public ShowBerlinClock() {
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
        assertEquals(this.result, result);
    }


    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(getClass().getClassLoader()));
    }


    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), this);
    }

    @Override
    @Test
    public void run() throws Throwable {
        super.run();
    }


}
