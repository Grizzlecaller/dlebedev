package ru.job4j.array;

/**
 * @author Dmitry Lebedev
 * @since 12.04.2018
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate sorter = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = sorter.remove(input);
        String[] expect = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }
}
