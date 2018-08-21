package ru.job4j.tracker;

/**
 * Class ExitActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 10.08.2018
 */
public class ExitActions implements UserAction {
    private int key;
    private String name;
    private final StartUI sUI;

    @Override
    public int key() {
        return 6;
    }

    public ExitActions(int key, String name, StartUI sUI) {
        this.key = key;
        this.name = name;
        this.sUI = sUI;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
       this.sUI.stop();
    }
    @Override
    public String info() {
        return String.format("%s. %s", key, name);
    }
}
