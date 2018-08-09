package ru.job4j.tracker;

/**
 * Class FindItemByIdActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class FindItemByIdActions implements UserAction {
    @Override
    public int key() {
        return 4;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Start findItemById --------------");
        String id = input.ask("id? :");
        Item findId = tracker.findById(id);
        if (findId == null) {
            System.out.println("Id not found");
        } else {
            System.out.println(findId.toString());
        }
    }
    @Override
    public String info() {
        return "Find item by ID";
    }
}
