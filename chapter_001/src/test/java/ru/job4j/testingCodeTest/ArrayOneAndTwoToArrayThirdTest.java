package ru.job4j.testingCodeTest;

/**
 * @author Dmitry Lebedev
 * @since 23.04.2018
 */

import org.junit.Test;
import ru.job4j.testingCode.ArrayOneAndTwoToArrayThird;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayOneAndTwoToArrayThirdTest {
    @Test
    public void WhenArrayOneAndTwoThenArrayThird() {
        ArrayOneAndTwoToArrayThird ArrayOne = new ArrayOneAndTwoToArrayThird();
        int[] inputOne = new int[] {1, 2, 3, 4, 5};
        int[] inputTwo = new int[] {10, 20, 30, 40, 50};
        int[] resultOne = ArrayOne.Fin(inputOne, inputTwo);
        int[] expect = new int[] {1, 2, 3, 4, 5, 10, 20, 30, 40, 50};
        assertThat(resultOne, is(expect));
    }
}
