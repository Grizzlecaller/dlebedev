package ru.job4j.tracker;

/**
 * Class AddActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class AddActions implements UserAction {
    @Override
    public int key() {
        return ADD;
    }
    @Override
    public void execute() {
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
    @Override
    public String info() {
        return "Add new Item";
    }




}
