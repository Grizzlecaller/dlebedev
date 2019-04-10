package ru.job4j.list;

/**
 * Class ConvertList2Array
 * @author Dmitry Lebedev
 * @since 26.03.2019
 */

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() % rows == 0 ? list.size() / rows : list.size() / (rows + 1);
        int[][] array = new int[rows][cells];
        /**
            int x = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cells; j++) {
                    if (x > list.size()) {
                        array[i][j] = 0;
                    }
                    if (x < list.size()) {
                        array[i][j] = list.get(x);
                        x++;
                    }
                }
            }
        */

            int i = 0;
            int j = 0;

            for (int tmp : list) {

                array[i][j] = list.get(tmp);

                if (j == (3)) {
                    i++;
                    j = -1;
                }
                j++;
            }
            return array;
    }
}
