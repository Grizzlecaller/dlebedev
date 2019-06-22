package ru.job4j.sort;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class SortUserTest
 * @author Dmitry Lebedev
 * @since 18.06.2019
 */

public class SortUserTest {
    @Test
    public void sortTest() {
        SortUser sort = new SortUser();
        User u0 = new User("U0", 0);
        User u1 = new User("U1", 1);
        User u2 = new User("U2", 2);
        User u3 = new User("U3", 3);
        User u4 = new User("U4", 4);
        List<User> list = new ArrayList<>();
        list.add(u4);
        list.add(u0);
        list.add(u3);
        list.add(u2);
        list.add(u1);
        Set<User> result = sort.sort(list);
        Set<User> expect = new LinkedHashSet<>();
        expect.add(u0);
        expect.add(u1);
        expect.add(u2);
        expect.add(u3);
        expect.add(u4);

        assertThat(result, is(expect));

    }
}
