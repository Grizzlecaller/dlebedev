package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Class MenuTracker
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class MenuTracker {
    /**
     * @param хранит ссылку на объект .
     */
    private Input input;
    /**
     * @param хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions(StartUI sUI) {
        this.actions.add(new AddActions(0, "Add new Item"));
        this.actions.add(new ShowAllActions(1, "Show all items"));
        this.actions.add(new EditReplaceActions(2, "Edit item"));
        this.actions.add(new DeleteItemActions(3, "Delete item"));
        this.actions.add(new FindItemByIdActions(4, "Find item by Id"));
        this.actions.add(new FindItemByNameActions(5, "Find items by name"));
        this.actions.add(new ExitActions(6, "Exit Program", sUI));
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    public List<Integer> range() {
        List<Integer> integers = new ArrayList<>();
        for (UserAction action : actions) {
            integers.add(action.key());
        }
        return integers;
    }
}
