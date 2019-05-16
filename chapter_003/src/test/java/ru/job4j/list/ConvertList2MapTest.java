package ru.job4j.list;

/**
 * Class ConvertList2MapTest
 * @author Dmitry Lebedev
 * @since 26.04.2019
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


public class ConvertList2MapTest {

    @Test
    public void something() {
        ConvertList2Map.UserConvert test = new ConvertList2Map().new UserConvert();

        final List<ConvertList2Map.User> actual = Arrays.asList(
                new ConvertList2Map.User("test", "test", 0),
                new ConvertList2Map.User("test1", "test1", 1),
                new ConvertList2Map.User("test2", "test2", 2)
        );

        final HashMap<Integer, ConvertList2Map.User> process = test.process(actual);

        Map<Integer, ConvertList2Map.User> ex = new HashMap<>();

        ex.put(0, new ConvertList2Map.User("test", "test", 0));
        ex.put(1, new ConvertList2Map.User("test1", "test1", 1));
        ex.put(2, new ConvertList2Map.User("test2", "test2", 2));

        Assert.assertEquals(process, ex);
    }
}
