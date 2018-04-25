package ru.job4j.testing;

/**
 * Class BubbleSort
 * @author Dmitry Lebedev
 * @since 23.04.2018
 */

/*
    Из двух отсортированных массивов перенести элементы в третий массив блез сортировки.
 */

public class ArrayOneAndTwoToArrayThird {
    public int[] fin(int[] array1, int[] array2) {
        //Указываем длинну конечного массива равную сумме длин array1 и array2
        int[] arrayFin = new int[array1.length + array2.length];
        /*
         * Двумя циклами заполняем массив arrayFin
         */
            /*
             * @param Заполняем массив arrayFin из array1
             */
            for (int i = 0; i < array1.length; i++) {
                arrayFin[i] = array1[i];
            }
            /*
             *  Заполняем массив arrayFin из array2
             */
            for (int j = 0; j < array2.length; j++) {
                //Заполнение arrayFin начинается с конца массива array1.
                arrayFin[array1.length + j] = array2[j];
            }
        return arrayFin;
    }
}