package ru.job4j.tracker;

/**
 * Class FindItemByIdActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class FindItemByIdActions extends BaseAction {
    private int key;
    private String name;

    @Override
    public int key() {
        return 4;
    }

    public FindItemByIdActions(int key, String name) {
        super(key, name);
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
}
