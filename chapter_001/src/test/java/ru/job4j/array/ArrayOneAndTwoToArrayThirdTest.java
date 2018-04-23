package ru.job4j.array;

/**
 * @author Dmitry Lebedev
 * @since 23.04.2018
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayOneAndTwoToArrayThirdTest {
    @Test
    public void WhenArrayOneAndTwoToArrayThird() {
        ArrayOneAndTwoToArrayThird ArrayOne = new ArrayOneAndTwoToArrayThird();
        int[] inputOne = new int[] {1, 2, 3, 4, 5};
        int[] inputTwo = new int[] {10, 20, 30, 40, 50};
        int[] resultOne = ArrayOne.Try(inputOne);
        //int[] resultTwo = ArrayOne.Try2(inputTwo);
        int[] expect = new int[] {1, 2, 3, 4, 5, 11, 12, 13, 14, 15};
        assertThat(resultOne, is(expect));
    }
}
