package ru.job4j.tracker;

/**
 * Class ValidateInput
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 27.08.2018
 */

import java.util.List;

public class ValidateInput implements Input {

    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    /*public ValidateInput(String[] strings) {
    }

    public ValidateInput() {

    }
*/
    public int ask(String question, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                    System.out.println("enter key from menu");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
