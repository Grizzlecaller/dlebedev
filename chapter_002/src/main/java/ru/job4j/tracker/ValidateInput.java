package ru.job4j.tracker;

/**
 * Class ValidateInput
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 27.08.2018
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ValidateInput implements Input {

    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    public int ask(String question, List<Integer> range) {
        return -1;
    }
    /*public int ask(String question, List<Integer> range) {
        class checkMenuNumber {
            boolean valid1 = false;
            int value = -1;
            if (this.checkMenuNumber()) {

            }
        }
        return -1;
    }*/

private final List<Consumer<ConsoleInput>> valid = Arrays.asList(
        item -> {
            if (!this.checkMenuNumber(item)) {
                throw new MenuOutException("enter key from menu");
            }
        }
);

// checkMenuNumber(MenuOutException moe)
// checkNotLetter(NumberFormatException nfe)

    /*boolean invalid = true;
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
*/

}
