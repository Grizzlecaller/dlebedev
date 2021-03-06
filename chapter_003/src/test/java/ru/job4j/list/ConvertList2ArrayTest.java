package ru.job4j.list;

/**
 * Class ConvertList2ArrayTest
 * @author Dmitry Lebedev
 * @since 26.03.2019
 */

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertList2ArrayTest {
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
}
