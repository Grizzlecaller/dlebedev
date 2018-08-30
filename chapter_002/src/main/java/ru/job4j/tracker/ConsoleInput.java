package ru.job4j.tracker;

/**
 * Class ConsoleInput
 * @author Dmitry Lebedev
 * @since 05.06.2018
 */

import java.util.*;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    public ConsoleInput(String[] strings) {
    }

    public ConsoleInput() {

    }

    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public int ask(String question, List<Integer> range) {
        System.out.println(question);
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutException("out of menu range");
        }
        return key;
    }
    public Boolean checkMenuNumber() {
        boolean b = false;

        return true;
    }
}
