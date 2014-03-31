package com.inkglobal.techtest;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: greg
 * Date: 29/03/14
 * Time: 00:36
 * notes from java 5+ + concatentation of string uses stringbuilder.
 */
public class BerlinFace implements Face {


    @Override
    public String render(final int hours, final int minutes, final int seconds) {

        final String s = renderSeconds(seconds);
        final String h = renderHours(hours);
        final String m = renderMinutes(minutes);
        return s + h + m;
    }

    String renderSeconds(final int seconds) {
        final char[] topRow = renderDivRow(seconds, 1, 2, 'Y', 'O');
        return new String(topRow);
    }

    String renderMinutes(final int minutes) {

        final char[] topRow = renderRow(minutes, 11, 5, 'O', 'Y');
        final char[] bottomRow = renderDivRow(minutes, 4, 5, 'O', 'Y');
        coloriseMinutes(topRow);
        return "\n" + new String(topRow) + "\n" + new String(bottomRow);
    }

    private void coloriseMinutes(final char[] row) {
        for (final int i : new int[]{2, 5, 8}) {
            if (row[i] == 'Y') {
                row[i] = 'R';
            }
        }

    }

    String renderHours(final int hours) {
        final char[] topRow = renderRow(hours, 4, 5, 'O', 'R');
        final char[] bottomRow = renderDivRow(hours, 4, 5, 'O', 'R');
        return "\n" + new String(topRow) + "\n" + new String(bottomRow);
    }

    private char[] renderRow(final int index, final int length, final int base, final char init, final char fill) {
        final char[] row = new char[length];
        Arrays.fill(row, init);
        Arrays.fill(row, 0, index / base, fill);
        return row;
    }


    private char[] renderDivRow(final int index, final int length, final int base, final char init, final char fill) {
        final char[] row = new char[length];
        Arrays.fill(row, init);
        Arrays.fill(row, 0, index % base, fill);
        return row;
    }


}
