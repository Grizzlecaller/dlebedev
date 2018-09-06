package ru.job4j.tracker;

/**
 * Class ShowAllActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class ShowAllActions extends BaseAction {
    private int key;
    private String name;

    @Override
    public int key() {
        return 1;
    }

    public ShowAllActions(int key, String name) {
        super(key, name);
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
}
