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
        /*queue.put(new Task("five", 5));
        queue.put(new Task("six", 6));
        queue.put(new Task("one", 1));
        queue.put(new Task("two", 2));
        queue.put(new Task("sewen", 7));
        queue.put(new Task("ten", 10));
        queue.put(new Task("three", 3));
        queue.put(new Task("four", 4));
*/
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("four", 4));
        queue.put(new Task("ten", 10));
        Task result = queue.take();
        //assertThat(result.getDesc(), is("urgent"));

        System.out.println(queue.tasks.get(0).getDesc());
        System.out.println(queue.tasks.get(1).getDesc());
        System.out.println(queue.tasks.get(2).getDesc());
        System.out.println(queue.tasks.get(3).getDesc());
        //System.out.println(queue.tasks.get(2).getDesc());
        /*System.out.println(queue.tasks.get(3).getDesc());
        System.out.println(queue.tasks.get(4).getDesc());
        System.out.println(queue.tasks.get(5).getDesc());
        System.out.println(queue.tasks.get(6).getDesc());
        System.out.println(queue.tasks.get(7).getDesc());
*/


        System.out.println(queue.tasks.size());
    }
}
