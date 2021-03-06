package ru.job4j.tracker;

import java.util.List;

/**
 * Class AddActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class AddActions extends BaseAction {
    private int key;
    private String name;

    @Override
    public int key() {
        return 0;
    }
    public AddActions(int key, String name) {
        super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Введите описание заявки :");
        String sCreate = input.ask("Введите create :");
        long create;
        create = Long.parseLong(sCreate);
        Item item = new Item(name, desc, create);
        tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }
}
