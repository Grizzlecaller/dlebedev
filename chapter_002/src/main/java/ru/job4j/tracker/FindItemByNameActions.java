package ru.job4j.tracker;

/**
 * Class FindItemByNameActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class FindItemByNameActions implements UserAction {
    @Override
    public int key() {
        return 5;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Start findItemsByName --------------");
        String name = input.ask("name? :");
        Item[] resultName = tracker.findByName(name);
        int resultNameLength = resultName.length;
        System.out.println("Количество объектов удовлетворяющих критерий поиска : " + (resultNameLength));
        for (int i = 0; i < resultNameLength; i++) {
            int rezNum = i + 1;
            System.out.println("Результат : " + rezNum);
            System.out.println(resultName[i].toString());
        }
        System.out.println("------------ End findItemsByName --------------");
    }
    @Override
    public String info() {
        return "Find item by name";
    }
}