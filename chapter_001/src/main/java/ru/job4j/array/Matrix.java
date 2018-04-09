package ru.job4j.array;

/**
 * Class BubbleSort
 * @author Dmitry Lebedev
 * @since 09.04.2018
 */

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table.length; j++){
                table[i][j] = (i + 1) * (j + 1);

            }
        }
        return table;
    }
}
