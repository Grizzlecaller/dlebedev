package ru.job4j.tracker;

import java.util.List;

/**
 * Interface Input
 * @author Dmitry Lebedev
 * @since 09.06.2018
 */

public interface Input {
    /**
     * Метод для получения данных от пользователя
     * @param question
     * @return
     */
    String ask(String question);

    int ask(String question, List<Integer> range);
}