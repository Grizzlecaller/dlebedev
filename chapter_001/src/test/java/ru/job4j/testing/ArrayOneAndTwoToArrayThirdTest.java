package ru.job4j.testing;

/**
 * @author Dmitry Lebedev
 * @since 23.04.2018
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayOneAndTwoToArrayThirdTest {
    @Test
    public void whenArrayOneAndTwoThenArrayThird() {
        ArrayOneAndTwoToArrayThird arrayOne = new ArrayOneAndTwoToArrayThird();
        int[] inputOne = new int[] {1, 2, 3, 4, 5};
        int[] inputTwo = new int[] {10, 20, 30, 40, 50};
        int[] resultOne = arrayOne.fin(inputOne, inputTwo);
        int[] expect = new int[] {1, 2, 3, 4, 5, 10, 20, 30, 40, 50};
        assertThat(resultOne, is(expect));
    }
}
