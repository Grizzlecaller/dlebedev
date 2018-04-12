package ru.job4j.array;

/**
 * Class BubbleSort
 * @author Dmitry Lebedev
 * @since 12.04.2018
 */

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int arrayLenght = array.length;
            for (int k = 0; k < arrayLenght; k++) {
                if (array[i].equals(array[i + 1])) {
                    String dupl = array[array.length];
                    array[i + 1] = array[array.length];
                    dupl = array[i + 1];
                }
            }
        } return array;
    }
}
