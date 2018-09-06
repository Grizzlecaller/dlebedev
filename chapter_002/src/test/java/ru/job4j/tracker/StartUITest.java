package ru.job4j.tracker;

/**
 * Class StartUITest
 * @author Dmitry Lebedev
 * @since 02.07.2018
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    public String forStartUITest() {
        return "0, Add new Item" + System.lineSeparator()
                + "1, Show all items" + System.lineSeparator()
                + "2, Edit item" + System.lineSeparator()
                + "3, Delete item" + System.lineSeparator()
                + "4, Find item by Id" + System.lineSeparator()
                + "5, Find items by name" + System.lineSeparator()
                + "6, Exit Program";
    }

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }
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

    @Test //showall
    public void whenAddThreeItemThackerHasNewItemsThenShowAllItems() {
        Tracker tracker = new Tracker();
        Item item0 = tracker.add(new Item("test name0", "desc0", 10123));
        Item item1 = tracker.add(new Item("test name1", "desc1", 11223));
        Item item2 = tracker.add(new Item("test name2", "desc2", 10323));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(this.out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add(forStartUITest())
                                .add("------------ Start findAllItems --------------")
                                .add("Количество объектов удовлетворяющих критерий поиска : 3")
                                .add("Элемент № : 1")
                                .add("name" + " " + "=" + " " + item0.getName())
                                .add("description" + " " + "=" + " " + item0.getDescription())
                                .add("create" + " " + "=" + " " + item0.getCreate())
                                .add("id" + " " + "=" + " " + item0.getId())
                                .add("-------------------------------")
                                .add("Элемент № : 2")
                                .add("name" + " " + "=" + " " + item1.getName())
                                .add("description" + " " + "=" + " " + item1.getDescription())
                                .add("create" + " " + "=" + " " + item1.getCreate())
                                .add("id" + " " + "=" + " " + item1.getId())
                                .add("-------------------------------")
                                .add("Элемент № : 3")
                                .add("name" + " " + "=" + " " + item2.getName())
                                .add("description" + " " + "=" + " " + item2.getDescription())
                                .add("create" + " " + "=" + " " + item2.getCreate())
                                .add("id" + " " + "=" + " " + item2.getId())
                                .add("-------------------------------")
                                .add("------------ End findAllItems --------------")
                                .add(forStartUITest())
                                .toString()
                )
        );
    }

    @Test //findById
    public void whenAddThreeItemThackerHasNewItemsThenfindById() {
        Tracker tracker = new Tracker();
        Item item0 = tracker.add(new Item("test name0", "desc0", 10123));
        Item item1 = tracker.add(new Item("test name1", "desc1", 11223));
        Item item2 = tracker.add(new Item("test name2", "desc2", 10323));
        Input input = new StubInput(new String[]{"4", item1.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(this.out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add(forStartUITest())
                                .add("------------ Start findItemById --------------")
                                .add("name" + " " + "=" + " " + item1.getName())
                                .add("description" + " " + "=" + " " + item1.getDescription())
                                .add("create" + " " + "=" + " " + item1.getCreate())
                                .add("id" + " " + "=" + " " + item1.getId())
                                .add(forStartUITest())
                                .toString()
                )
        );
    }

    @Test //findByName
    public void whenAddThreeItemThackerHasNewItemsThenfindByName() {
        Tracker tracker = new Tracker();
        Item item0 = tracker.add(new Item("test name0", "desc0", 10123));
        Item item1 = tracker.add(new Item("test name1", "desc1", 11223));
        Item item2 = tracker.add(new Item("test name2", "desc2", 10323));
        Input input = new StubInput(new String[]{"5", item2.getName(), "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(this.out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add(forStartUITest())
                                .add("------------ Start findItemsByName --------------")
                                .add("Количество объектов удовлетворяющих критерий поиска : 1")
                                .add("Результат : 1")
                                .add("name" + " " + "=" + " " + item2.getName())
                                .add("description" + " " + "=" + " " + item2.getDescription())
                                .add("create" + " " + "=" + " " + item2.getCreate())
                                .add("id" + " " + "=" + " " + item2.getId())
                                .add("------------ End findItemsByName --------------")
                                .add(forStartUITest())
                                .toString()
                )
        );
    }

}
