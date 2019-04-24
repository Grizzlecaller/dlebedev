package ru.job4j.list;

/**
 * Class ConvertList2ArrayTest2
 * @author Dmitry Lebedev
 * @since 18.04.2019
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ConvertList2ArrayTest2 {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };

        assertThat(result, is(expect));
    }


    @Test
    public void name() {
        final List<Integer> list = Arrays.asList(1, 2, 3);
        for (Integer temp : list) {
            System.out.println(temp);
        }
    }

    @Test
    public void when2MassThen1List() {
        ConvertList2Array2 list = new ConvertList2Array2();
        List<int[]> result = new ArrayList<>();
        int[] aTmp = {1, 2, 3, 4};
        int[] bTmp = {4, 3, 2, 1};

        result.add(0, aTmp);
        result.add(1, bTmp);
        list.convert(result);
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4, 4, 3, 2, 1
        );
        assertThat(result, is(expect));
    }
}
