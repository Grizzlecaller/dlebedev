package ru.job4j.list;

/**
 * Class ConvertList2Array
 * @author Dmitry Lebedev
 * @since 26.03.2019
 */

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() % rows == 0 ? list.size() / rows : (list.size() / rows) + 1;
        int[][] array = new int[rows][cells];

            int i = 0;
            int j = 0;

            for (int tmp : list) {

                array[i][j++] = tmp;

                if (j == (array[i].length)) {
                    i++;
                    j = 0;
                }
            }
            return array;
    }
}
