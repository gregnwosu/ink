package com.inkglobal.techtest;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: greg
 * Date: 30/03/14
 * Time: 04:11
 * To change this template use File | Settings | File Templates.
 */
public class ClockTest {

    private Clock clock;

    @Before
    public void setup() {
        this.clock = new Clock(new BerlinFace());
    }

    @Test
    public void shouldParseDateTime() {
        final DateTime dt = clock.parse("00:00:00");
        assertEquals(0, dt.getHourOfDay());

    }
}
