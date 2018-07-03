package ru.job4j.tracker;

/**
 * Class StartUITest
 * @author Dmitry Lebedev
 * @since 02.07.2018
 */

import org.junit.Test;

import javax.sound.midi.Track;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test //add
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "11", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test //findById + edit
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc", 123));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "22", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test //delete
    public void whenAddThreeItemThackerHasNewItemsThenDeleteSecondItem() {
        Tracker tracker = new Tracker();
        Item item0 = tracker.add(new Item("test name0", "desc0", 1123));
        Item item1 = tracker.add(new Item("test name1", "desc1", 2123));
        Item item2 = tracker.add(new Item("test name2", "desc2", 3123));
        Input input = new StubInput(new String[]{"3", item1.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[1].getName(), is("test name2"));
    }
}
