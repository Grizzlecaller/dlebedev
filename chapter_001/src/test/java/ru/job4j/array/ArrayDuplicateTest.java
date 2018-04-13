package ru.job4j.array;

/**
 * @author Dmitry Lebedev
 * @since 12.04.2018
 */
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate sorter = new ArrayDuplicate();
        String[] input = new String[] {"1", "1", "2", "2", "3", "3"};
        String[] result = sorter.remove(input);
        String[] expect = new String[] {"1", "2", "3"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate1() {
        ArrayDuplicate sorter = new ArrayDuplicate();
        String[] input = new String[] {"1", "2", "2", "3", "4", "3"};
        String[] result = sorter.remove(input);
        String[] expect = new String[] {"1", "2", "3", "4"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}
