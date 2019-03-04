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
        //int tmp = this.tasks.size() + 1;
        if (task.getPriority() > this.tasks.size() + 1) { //норм
            this.tasks.addLast(task);
        } else {
            if (task.getPriority() < this.tasks.getFirst().getPriority()) {
                this.tasks.addFirst(task);
            } else {
                this.tasks.add(task.getPriority() - 1, task);
            }

        /*}
        if (task.getPriority() < this.tasks.getFirst().getPriority()) {
            this.tasks.addFirst(task);
        } else {
         */
        }

    }

    public Task take() {
        return this.tasks.poll();
    }
}