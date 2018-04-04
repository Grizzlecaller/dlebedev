package ru.job4j.array;

/**
 * Class Paint
 * @author Dmitry Lebedev
 * @since 03.04.2018
 */

public class Turn {
    public int[] turn(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int tmp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = tmp;
        } return array;
    }
}

