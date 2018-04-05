package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array){
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[i + 1]) {
                int tmp = array[i];
                array[i + 1] = tmp;
            } else if(array[i] > array[i + 1]) {
                int tmp = array[i + 1];
                array[i + 1] = tmp;
            }
            }
        return array;
    }
}
