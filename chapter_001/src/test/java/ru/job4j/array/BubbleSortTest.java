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
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray1() {
        BubbleSort turner = new BubbleSort();
        int[] input = new int[] {17, 3, 54, 32, 48, 10, 7};
        int[] result = turner.sort(input);
        int[] expect = new int[] {3, 7, 10, 17, 32, 48, 54};
        assertThat(result, is(expect));
    }
}
