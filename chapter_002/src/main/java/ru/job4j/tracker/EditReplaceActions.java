package ru.job4j.tracker;

/**
 * Class EditReplaceActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class EditReplaceActions implements UserAction {
    private int key;
    private String name;

    @Override
    public int key() {
        return 2;
    }

    public EditReplaceActions(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Start editReplace --------------");
        String id = input.ask("id task for edit? :");
        String name = input.ask("Введите новое имя заявки :");
        String desc = input.ask("Введите новое описание заявки :");
        String sCreate = input.ask("Введите новое create :");
        long create = 0;
        create = Long.parseLong(sCreate);
        Item newItem = new Item(name, desc, create);
        if (tracker.replace(id, newItem)) {
            System.out.println("Edit successful!");
        } else {
            System.out.println("Item not found!");
        }
        System.out.println("------------ End editReplace --------------");
    }
    @Override
    public String info() {
        return String.format("%s, %s", key, name);
    }
}
