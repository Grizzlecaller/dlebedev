package ru.job4j.tracker;

import java.util.ArrayList;

/**
 * Class FindItemByNameActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class FindItemByNameActions extends BaseAction {
    private int key;
    private String name;

    @Override
    public int key() {
        return 5;
    }

    public FindItemByNameActions(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Start findItemsByName --------------");
        String name = input.ask("name? :");
        ArrayList<Item> resultName = tracker.findByName(name);
        int resultNameLength = resultName.size();
        System.out.println("Количество объектов удовлетворяющих критерий поиска : " + (resultNameLength));
        for (int i = 0; i < resultNameLength; i++) {
            int rezNum = i + 1;
            System.out.println("Результат : " + rezNum);
            System.out.println(resultName.get(i).toString());
        }
        System.out.println("------------ End findItemsByName --------------");
    }
}
