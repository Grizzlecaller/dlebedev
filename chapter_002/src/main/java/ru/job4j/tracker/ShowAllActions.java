package ru.job4j.tracker;

/**
 * Class ShowAllActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class ShowAllActions implements UserAction {
    @Override
    public int key() {
        return 1;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Start findAllItems --------------");
        Item[] result = tracker.getAll();
        int resultLength = result.length;
        int i = 0;
        int rezNum = i + 1;
        System.out.println("Количество объектов удовлетворяющих критерий поиска : " + resultLength);
        for (i = 0; i < resultLength; i++) {
            System.out.println("Элемент № : " + rezNum);
            System.out.println(result[i].toString());
            System.out.println("-------------------------------");
            rezNum++;
        }
        System.out.println("------------ End findAllItems --------------");
    }
    @Override
    public String info() {
        return "Show all items";
    }
}
