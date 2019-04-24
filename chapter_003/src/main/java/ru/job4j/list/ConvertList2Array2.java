package ru.job4j.list;

/**
 * Class ConvertList2Array2
 * @author Dmitry Lebedev
 * @since 18.04.2019
 */

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array2 {
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

    public List<Integer> convert (List<int[]> list) {
        //list.add(new int[]{1, 2});
        //list.add(new int[]{3, 4, 5, 6});
        List<Integer> result = new ArrayList<>();

        int i = 0;
        for (int[] tmpI : list) {
            for (int tmpJ : tmpI) {
                result.add(i++, tmpJ);
            }
        }
        return result;
    }
}
