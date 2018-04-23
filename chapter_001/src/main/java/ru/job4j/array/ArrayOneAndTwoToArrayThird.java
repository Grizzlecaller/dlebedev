package ru.job4j.array;

import java.lang.reflect.Array;

/**
 * Class BubbleSort
 * @author Dmitry Lebedev
 * @since 23.04.2018
 */

//Из двух отсортированных массивов перенести элементы в третий массив блез сортировки.

public class ArrayOneAndTwoToArrayThird {
    public int[] Try(int[] array) {
        int[] xxx = new int[array.length];
            for (int i = 0; i < array.length - 1; i++) {
                int tmp = array[array.length - 1];
                xxx[i] = array[array.length - i - 1];
                xxx[xxx.length - i - 1] = array[i];
            } return xxx;
    }
    public int[] Try2(int[] array2) {
        int[] zzz = new int[array2.length];
        for (int i = 0; i < array2.length - 1; i++) {
            int tmp = array2[array2.length - 1];
            zzz[i] = array2[array2.length - i - 1];
            zzz[zzz.length - i - 1] = array2[i];
        } return zzz;
    }
}
