package ru.job4j.array;

import java.lang.reflect.Array;

/**
 * Class BubbleSort
 * @author Dmitry Lebedev
 * @since 23.04.2018
 */

//Из двух отсортированных массивов перенести элементы в третий массив блез сортировки.

public class ArrayOneAndTwoToArrayThird {
    public int[] One(int[] array) {
        int[] testArray = new int[array.length];
            for(int i = 0; i < array.length; i++){
                int arrayLength = array.length;
                int tmp = 0;
                tmp = testArray[arrayLength - 1];
                testArray[arrayLength - 1] = i;
                testArray[i] = tmp;
            }
        return array;
    }
}
