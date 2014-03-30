/**
 * Created with IntelliJ IDEA.
 * User: greg
 * Date: 28/03/14
 * Time: 22:37
 * To change this template use File | Settings | File Templates.
 */
package com.inkglobal.techtest;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

//NotThreadSafe
public class Clock {

    private final Face r;
    private final DateTimeFormatter parser;
    private DateTime t;

    public Clock(Face r) {
        this.r = r;
        this.parser = DateTimeFormat.forPattern("HH:mm:ss");

    }

    public void setInput(final String input) {
        this.t = parse(input);
    }

    final DateTime parse(final String input) throws IllegalArgumentException {
        return parser.parseDateTime(input);

    }


    public final String display() {
        return r.render(t.getHourOfDay(), t.getMinuteOfHour(), t.getSecondOfMinute());
    }
}