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

        queue.put(new Task("low", 5));
        queue.put(new Task("eleven", 11));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("ten", 10));
        queue.put(new Task("middle", 3));
        queue.put(new Task("four", 4));


        //Task result = queue.take();
        //assertThat(result.getDesc(), is("urgent"));


        for (int i = 0; i < queue.tasks.size(); i++) {
            System.out.println(queue.tasks.get(i).getDesc());
        }
        System.out.println("---------------------");
        System.out.println("Размер связного списка = " + queue.tasks.size());

    }
}
