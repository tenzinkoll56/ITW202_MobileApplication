package com.example.todo_10;

import androidx.test.filters.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
@SmallTest
public class ExampleUnitTest {
    private Calculator mcal;

    @Before

    public void setUp() {
        mcal = new Calculator();
    }

    @Test
    public void addTwoNumber() {
        double result = mcal.add(1d, 2d);
        assertThat(result, is(equalTo(3d)));
    }

    @Test
    public void addTwoNumberForNegative() {
        double result = mcal.add(-1d, 2d);
        assertThat(result, is(equalTo(1d)));
    }

    @Test
    public void addTwoNumberForFloat() {
        double result = mcal.add(1.1f, 2.1d);
        assertThat(result, is(closeTo(3.2d, 0.01)));
    }

    @Test
    public void subTwoNumber() {
        double result = mcal.sub(4d, 2d);
        assertThat(result, is(equalTo(2d)));
    }

    @Test
    public void subTwoNumberForNegative() {
        double result = mcal.sub(-1d, 2d);
        assertThat(result, is(equalTo(-3d)));
    }

    @Test
    public void subTwoNumberForFloat() {
        double result = mcal.sub(3.1f, 2.1d);
        assertThat(result, is(closeTo(1.0d, 0.01)));
    }

    @Test
    public void divTwoNumber() {
        double result = mcal.div(4d, 2d);
        assertThat(result, is(equalTo(2d)));
    }

    @Test
    public void divTwoNumberForNegative() {
        double result = mcal.div(-10d, 2d);
        assertThat(result, is(equalTo(-5d)));
    }

    @Test
    public void divTwoNumberForFloat() {
        double result = mcal.div(4.0f, 2.0d);
        assertThat(result, is(closeTo(2.0d, 0.01)));
    }

    @Test
    public void divTwoNumbersZero() {
        double result = mcal.div(32.d, 0);
        assertThat(result, is(equalTo(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void mulTwoNumber() {
        double result = mcal.mul(4d, 3d);
        assertThat(result, is(equalTo(12d)));
    }
}