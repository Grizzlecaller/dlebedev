package ru.job4j.tracker;

/**
 * Class ExitActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 10.08.2018
 */
public class ExitActions extends BaseAction {
    private int key;
    private String name;
    private final StartUI sUI;

    @Override
    public int key() {
        return 6;
    }

    public ExitActions(int key, String name, StartUI sUI) {
        super(key, name);
        this.sUI = sUI;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
       this.sUI.stop();
    }
}
