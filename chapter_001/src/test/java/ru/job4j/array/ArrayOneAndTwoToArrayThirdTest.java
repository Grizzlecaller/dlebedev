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
        int[] firstOne = new int[] {1, 2, 3, 4, 5};
        int[] secondOne = new int[] {11, 12, 13, 14, 15};
        //int[] resultOne = One.arrayOneAndTwoToArrayThird(firstOne);
        //int[] resultTwo = One.arrayOneAndTwoToArrayThird(secondOne);
        int[] result = ArrayOne.One(firstOne);
        int[] expect = new int[] {1, 2, 3, 4, 5, 11, 12, 13, 14, 15};
        assertThat(result, is(expect));
    }
}
