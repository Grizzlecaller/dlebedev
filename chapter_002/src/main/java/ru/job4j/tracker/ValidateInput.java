package ru.job4j.tracker;

/**
 * Class ValidateInput
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 27.08.2018
 */

import java.util.List;

public class ValidateInput extends ConsoleInput {

    public ValidateInput(String[] strings) {
    }

    public ValidateInput() {

    }

    public int ask(String question, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                    System.out.println("enter key from menu");
            } catch (NumberFormatException nfe) {
                System.out.println("enter correct data");
            }
        } while (invalid);
        return value;
    }
}
