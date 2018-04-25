package ru.job4j.array;

import java.util.Arrays;

/**
 * Class BubbleSort
 * @author Dmitry Lebedev
 * @since 12.04.2018
 */

public class ArrayDuplicate {
    /*
        @param array - принимает массив с дубликатами
        @return array - возвращает массив без будликатов
     */
    public String[] remove(String[] array) {
        int arrayLength = array.length;
        for (int out = 0; out < arrayLength; out++) {
            for (int in = out + 1; in < arrayLength; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[arrayLength - 1];
                    arrayLength--;
                    in--;
                }
            }
        } return Arrays.copyOf(array, arrayLength);
    }
}
