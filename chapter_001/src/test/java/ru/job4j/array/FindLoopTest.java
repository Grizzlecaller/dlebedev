package ru.job4j.array;

/**
 * @author Dmitry Lebedev
 * @since 03.04.2018
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasLengh10Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {16, 10, 18};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasLengh15Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {25, 21, 15};
        int value = 15;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasLengh8Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {26, 8, 7};
        int value = 8;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }
}
