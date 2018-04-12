package ru.job4j.array;

import java.util.Arrays;

/**
 * Class BubbleSort
 * @author Dmitry Lebedev
 * @since 12.04.2018
 */

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int arrayLenght = array.length;
        for (int i = 0; i < arrayLenght - 1; i++) {
            for (int k = 0; k < arrayLenght - 1; k++) {
                String z = array[i];
                if (z.equals(array[i + 1])) {
                    String dupl = array[array.length];
                    array[i + 1] = array[array.length];
                    dupl = array[i + 1];
                }
            }
        } return Arrays.copyOf(array, 5);
    }
}
