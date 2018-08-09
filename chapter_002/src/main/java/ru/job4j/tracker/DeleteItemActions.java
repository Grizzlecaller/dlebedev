package ru.job4j.tracker;

/**
 * Class DeleteItemActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 08.08.2018
 */

public class DeleteItemActions implements UserAction {

    @Override
    public int key() {
        return DELETE;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Start deleteItem --------------");
        String id = input.ask("id? :");
        System.out.println("------------ Analise --------------");
        if (tracker.delete(id)) {
            System.out.println("Delete Successful!");
        } else {
            System.out.println("Item not Found!");
        }
        System.out.println("------------ End deleteItem --------------");
    }
    @Override
    public String info() {
        return "Delete item";
    }
}
