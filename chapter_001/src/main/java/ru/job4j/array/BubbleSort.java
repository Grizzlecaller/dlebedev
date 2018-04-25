package ru.job4j.array;

/**
 * Class BubbleSort
 * @author Dmitry Lebedev
 * @since 03.04.2018
 */

public class BubbleSort {
    public int[] sort(int[] array) {
        for (int v = 0; v < array.length; v++) {
            int arrayLength = array.length;
            for (int i = 0; i < arrayLength - 1; i++) {
                int tmp1 = array[i];
                int tmp2 = array[i + 1];
                if (tmp1 > tmp2) {
                    array[i + 1] = tmp1;
                    array[i] = tmp2;
                }
            }
        } return array;
    }
}
