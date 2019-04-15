package ru.job4j.list;

/**
 * Class ConvertMatrix2List
 * @author Dmitry Lebedev
 * @since 15.04.2019
 */

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();

        int j = 0;

        for (int[] tmpI : array) {
            for (int tmpJ : tmpI) {
                list.add(j++, tmpJ);
            }
        }
        return list;
    }
}
