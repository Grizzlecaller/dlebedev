package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Dmitry Lebedev
 * @since 21.03.2018
 */

public class CounterTest {
    @Test
    public void whenCalculateOneToTenDivisibleTwo() {
        Counter summ = new Counter();
        int result = summ.add(0, 10);
        assertThat(result, is(30));
    }
}