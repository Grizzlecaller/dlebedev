package ru.job4j.tracker;

/**
 * Class ConsoleInput
 * @author Dmitry Lebedev
 * @since 05.06.2018
 */

import java.util.*;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
