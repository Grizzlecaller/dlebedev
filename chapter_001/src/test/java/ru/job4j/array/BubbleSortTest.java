package ru.job4j.array;

/**
 * @author Dmitry Lebedev
 * @since 03.04.2018
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        BubbleSort turner = new BubbleSort();
        int[] input = new int[] {9, 4, 5, 8, 1};
        int[] result = turner.sort(input);
        int[] expect = new int[] {1, 4, 5, 8, 9};
        assertThat(result, is(expect));
    }
}
