package ru.job4j.list;

/**
 * Class ConvertList2MapTest
 * @author Dmitry Lebedev
 * @since 26.04.2019
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ConvertList2MapTest {

    @Test
    public void something() {
        ConvertList2Map test = new ConvertList2Map();

        final List<ConvertList2Map.User> actual = Arrays.asList(
                new ConvertList2Map.User("test", "test", 0),
                new ConvertList2Map.User("test1", "test1", 1),
                new ConvertList2Map.User("test2", "test2", 2)
        );

        Assert.assertEquals(expected, actual);
    }
}
