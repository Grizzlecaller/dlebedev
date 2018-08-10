package ru.job4j.tracker;

/**
 * Class ExitActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 10.08.2018
 */
public class ExitActions implements UserAction {
    private int key;
    private String name;

    @Override
    public int key() {
        return 6;
    }

    public ExitActions(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        boolean exit = false;
        if (input.ask("exit?").equals(key())) {
            exit = true;
        }
    }
    @Override
    public String info() {
        return String.format("%s, %s", key, name);
    }
}
