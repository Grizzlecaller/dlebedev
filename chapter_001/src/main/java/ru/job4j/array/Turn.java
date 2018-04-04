package ru.job4j.array;

/**
 * Class Paint
 * @author Dmitry Lebedev
 * @since 03.04.2018
 */

public class Turn {
    int xedni;
    int a = 0;
    public int[] turn(int[] array) {
        for (int index = 0; index < array.length; index++) {
            array[index] = index;

        }
        /*public int[] back ( int[] array){
            for (xedni = array.length; xedni >= array.length; xedni--) {
                array[xedni] = 1;


            }
            return array;
        }*/ return array;
    }
}

