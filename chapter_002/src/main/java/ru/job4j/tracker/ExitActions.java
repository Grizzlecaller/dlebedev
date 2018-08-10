package ru.job4j.tracker;

/**
 * Class ExitActions
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 10.08.2018
 */
public class ExitActions implements UserAction {
    @Override
    public int key() {
        return 6;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        boolean exit = false;
        if (input.ask("exit?").equals(key())) {
            exit = true;
        }
    }
}
