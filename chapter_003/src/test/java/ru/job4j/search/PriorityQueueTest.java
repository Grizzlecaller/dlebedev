package ru.job4j.search;

/**
 * Class PriorityQueueTest
 * @author Dmitry Lebedev
 * @since 25.02.2019
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("four", 4));
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 2));
        queue.put(new Task("test", 3));
        Task result = queue.take();
        //assertThat(result.getDesc(), is("urgent"));

        System.out.println(queue.n);
    }
}
