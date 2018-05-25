package ru.job4j.tracker;

/**
 * Class TrackerTest
 * @author Dmitry Lebedev
 * @since 17.05.2018
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenReplaceNameThenReturnNewName() {

        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

        @Test
        public void whenReplaceNameThenReturnNewNameAgain() {
        Tracker tracker = new Tracker();
        Item next = new Item("test", "testDescription", 123L);
        Item next1 = new Item("test1", "testDescription1", 1234L);
        Item next2 = new Item("test2", "testDescription2", 12345L);
        Item next3 = new Item("test3", "testDescription3", 12346L);
        Item next4 = new Item("test4", "testDescription4", 12347L);
        Item next5 = new Item("test5", "testDescription5", 12348L);
        Item next6 = new Item("test6", "testDescription6", 12349L);
        Item next7 = new Item("test7", "testDescription7", 123410L);
            // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
            tracker.add(next);
            tracker.add(next1);
            tracker.add(next2);
            tracker.add(next3);
            tracker.add(next4);
            tracker.add(next5);
            tracker.add(next6);
            tracker.add(next7);

        // Проставляем старый id из previous, который был сгенерирован выше.
        next6.setId(next3.getId());
        // Обновляем заявку в трекере.
        tracker.replace(next3.getId(), next6);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(next3.getId()).getName(),  is("test6"));
    }

    @Test
    public void whenAddTwoItemThenDeleteFirstItem() {
        Tracker tracker = new Tracker();
        Item next0 = new Item("test", "testDescription", 123L);
        Item next1 = new Item("test1", "testDescription1", 1234L);
        Item next2 = new Item("test2", "testDescription2", 12345L);
        Item next3 = new Item("test3", "testDescription3", 12346L);
        Item next4 = new Item("test4", "testDescription4", 12347L);
        Item next5 = new Item("test5", "testDescription5", 12348L);
        Item next6 = new Item("test6", "testDescription6", 12349L);
        Item next7 = new Item("test7", "testDescription7", 123410L);
        tracker.add(next0);
        tracker.add(next1);
        tracker.add(next2);
        tracker.add(next3);
        tracker.add(next4);
        tracker.add(next5);
        tracker.add(next6);
        tracker.add(next7);
        tracker.delete(next3.getId());
        assertThat(tracker.findById(next3.getId()).getName(), is("NULL"));

    }

    @Test
    public void findByNameFindNameFour() {
        Tracker tracker = new Tracker();
        Item next0 = new Item("test", "testDescription", 123L);
        Item next1 = new Item("test1", "testDescription1", 1234L);
        Item next2 = new Item("test2", "testDescription2", 12345L);
        Item next3 = new Item("test3", "testDescription3", 12346L);
        Item next4 = new Item("test4", "testDescription4", 12347L);
        Item next5 = new Item("test5", "testDescription5", 12348L);
        Item next6 = new Item("test6", "testDescription6", 12349L);
        Item next7 = new Item("test7", "testDescription7", 123410L);
        tracker.add(next0);
        tracker.add(next1);
        tracker.add(next2);
        tracker.add(next3);
        tracker.add(next4);
        tracker.add(next5);
        tracker.add(next6);
        tracker.add(next7);
        tracker.getAll();
        assertThat(tracker.findByName("test4"), is("test4"));
    }
}
