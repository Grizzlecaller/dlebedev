package ru.job4j.sort;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class SortUserTest
 * @author Dmitry Lebedev
 * @since 18.06.2019
 */

public class SortUserTest {
    @Test
    public void sortTest() {
        SortUser sort = new SortUser();
        final List<User> userList = new ArrayList<User>();

        userList.add(new User("test0", "0"));
        userList.add(new User("test1", "1"));
        userList.add(new User("test2", "2"));
        userList.add(new User("test3", "3"));
        userList.add(new User("test4", "4"));
        userList.add(new User("test5", "5"));
    }
}
