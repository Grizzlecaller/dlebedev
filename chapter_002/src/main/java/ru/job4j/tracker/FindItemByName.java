package ru.job4j.tracker;

/**
 * Class FindItemByName
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class FindItemByName implements UserAction {
    @Override
    public int key() {
        return FINDITEMSBYNAME;
    }
    @Override
    public void findItemsByName() {
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
