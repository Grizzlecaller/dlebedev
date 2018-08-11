package ru.job4j.tracker;

import java.util.List;

/**
 * Interface Input
 * @author Dmitry Lebedev
 * @since 09.06.2018
 */

public interface Input {

    int ask(String question, List<Integer> range);
}
