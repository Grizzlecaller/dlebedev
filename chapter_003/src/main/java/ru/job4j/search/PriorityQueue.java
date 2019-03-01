package ru.job4j.search;

import java.util.LinkedList;

/**
 * Class PriorityQueue
 * @author Dmitry Lebedev
 * @since 25.02.2019
 */

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */


    public void put(Task task) {
        //TODO добавить вставку в связанный список.
        /**
         * тут происходит вставка в список, на нулевой индекс
         * при этом каждый раз инициализируется метод put
         * следовательно надо каким-то образом считать количество инициализаций
         * и что?
         * и уже в готовом связном списке сортировать с помощью Comparator
         *
         */
        this.tasks.add(task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}
