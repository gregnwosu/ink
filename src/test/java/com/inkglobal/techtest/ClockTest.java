package com.inkglobal.techtest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: greg
 * Date: 31/03/14
 * Time: 01:30
 * To change this template use File | Settings | File Templates.
 */
public class ClockTest {

    private Clock clock;

    @Before
    public void setup() {
        this.clock = new Clock(new BerlinFace());
    }


    @Test
    public void shouldParseClockStrings() {
        clock.setInput("12:33:22");
        assertEquals(12, clock.getHour());
        assertEquals(33, clock.getMinute());
        assertEquals(22, clock.getSecond());


    }
}
