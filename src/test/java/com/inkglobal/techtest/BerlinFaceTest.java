package com.inkglobal.techtest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: greg
 * Date: 30/03/14
 * Time: 14:47
 * To change this template use File | Settings | File Templates.
 */
public class BerlinFaceTest {


    private BerlinFace bf;

    @Before
    public void setup() {
        this.bf = new BerlinFace();
    }


    @Test
    public void shouldRenderOddSecondsAsY() {
        assertEquals("\nY", bf.renderSeconds(30));
        assertEquals("\nO", bf.renderSeconds(31));
        assertEquals("\nY", bf.renderSeconds(0));
    }


    @Test
    public void shouldRenderHoursCorrectly() {
        assertEquals("\nOOOO\nOOOO", bf.renderHours(0));
        assertEquals("\nRROO\nRRRO", bf.renderHours(13));
        assertEquals("\nRRRR\nRRRO", bf.renderHours(23));
        assertEquals("\nRRRR\nRRRR", bf.renderHours(24));
    }


    @Test
    public void shouldRenderMinutesCorrectly() {
        assertEquals("\nOOOOOOOOOOO\nOOOO", bf.renderMinutes(0));
        assertEquals("\nYYROOOOOOOO\nYYOO", bf.renderMinutes(17));
        assertEquals("\nYYRYYRYYRYY\nYYYY", bf.renderMinutes(59));

    }
}
