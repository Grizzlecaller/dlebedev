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
        if (task.getPriority() == 1) {
            this.tasks.add(0, task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}
