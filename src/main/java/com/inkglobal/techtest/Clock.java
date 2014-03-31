/**
 * Created with IntelliJ IDEA.
 * User: greg
 * Date: 28/03/14
 * Time: 22:37
 * notes: originally used joda time for parisng the dates however it barfed on 24:00..
 *
 * is this really a requirement? switched to use scanners at the expense  of some sanity
 */
package com.inkglobal.techtest;


import java.util.Scanner;


public class Clock {

    private final Face r;
    private int hour;
    private int minute;
    private int second;


    public int getHour() {
        return hour;
    }


    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }


    public Clock(Face r) {
        this.r = r;
    }

    public void setInput(final String input) {
        final Scanner t = new Scanner(input);
        t.useDelimiter(":");
        this.hour = t.nextInt();
        this.minute = t.nextInt();
        this.second = t.nextInt();

    }


    public final String display() {

        return r.render(hour, minute, second);
    }
}