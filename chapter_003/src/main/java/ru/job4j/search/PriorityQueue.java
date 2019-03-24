package ru.job4j.search;

import java.util.LinkedList;

/**
 * Class PriorityQueue
 * @author Dmitry Lebedev
 * @since 25.02.2019
 */

public class PriorityQueue {
    public LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     *
     * @param task задача
     */

    public void put(Task task) {
        //TODO добавить вставку в связанный список.

        int a = this.tasks.size();

        if (this.tasks.size() == 0) {
            this.tasks.add(task);
        } else {
            for (int i = 0; task.getPriority() < this.tasks.get(i).getPriority(); i++) {
                a = i;
                break;
            }
            this.tasks.add(a, task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}
