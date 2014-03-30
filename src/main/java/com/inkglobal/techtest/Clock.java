/**
 * Created with IntelliJ IDEA.
 * User: greg
 * Date: 28/03/14
 * Time: 22:37
 * To change this template use File | Settings | File Templates.
 */
package com.inkglobal.techtest;


import java.util.Scanner;


public class Clock {

    private final Face r;
    private Scanner t;


    public Clock(Face r) {
        this.r = r;


    }

    public void setInput(final String input) {
        this.t = new Scanner(input);
        this.t.useDelimiter(":");

    }


    public final String display() {
        final int hour = t.nextInt();
        final int minute = t.nextInt();
        final int second = t.nextInt();
        return r.render(hour, minute, second);
    }
}