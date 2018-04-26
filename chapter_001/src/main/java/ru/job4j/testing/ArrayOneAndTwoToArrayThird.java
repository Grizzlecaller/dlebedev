package ru.job4j.testing;

/**
 * Class BubbleSort
 * @author Dmitry Lebedev
 * @since 23.04.2018
 */

public class ArrayOneAndTwoToArrayThird {
    public int[] fin(int[] array1, int[] array2) {
        int[] arrayFin = new int[array1.length + array2.length];
            for (int i = 0; i < array1.length; i++) {
                arrayFin[i] = array1[i];
            }
            for (int j = 0; j < array2.length; j++) {
                arrayFin[array1.length + j] = array2[j];
            }
        return arrayFin;
    }
}