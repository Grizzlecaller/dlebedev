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
        SortUser sortList = new SortUser();
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
        Set<User> result = sortList.sortName(list);
        Set<User> expect = new LinkedHashSet<>();
        expect.add(u0);
        expect.add(u1);
        expect.add(u2);
        expect.add(u3);
        expect.add(u4);

        assertThat(result, is(expect));

    }

    @Test
    public void sortNameLenghtTest() {
        SortUser sortNameLenghtTestComp = new SortUser();
        User u0 = new User("0", 0);
        User u1 = new User("11", 1);
        User u2 = new User("222", 2);
        User u3 = new User("3333", 3);
        User u4 = new User("44444", 4);
        List<User> list1 = new ArrayList<>();
        list1.add(u4);
        list1.add(u0);
        list1.add(u3);
        list1.add(u2);
        list1.add(u1);
        List<User> result = sortNameLenghtTestComp.sortNameLenght(list1);
        List<User> expect = new ArrayList<>();
        expect.add(u0);
        expect.add(u1);
        expect.add(u2);
        expect.add(u3);
        expect.add(u4);
        assertThat(result, is(expect));
    }
    @Test
    public void sortAgeTest() {
        SortUser sortAgeTestComp = new SortUser();
        User u0 = new User("a", 23);
        User u1 = new User("bb", 21);
        User u2 = new User("ccc", 45);
        User u3 = new User("dddd", 12);
        User u4 = new User("eeeee", 31);
        List<User> list2 = new ArrayList<>();
        list2.add(u4);
        list2.add(u0);
        list2.add(u3);
        list2.add(u2);
        list2.add(u1);
        List<User> result = sortAgeTestComp.sortAge(list2);
        List<User> expect = new ArrayList<>();
        expect.add(u3);
        expect.add(u1);
        expect.add(u0);
        expect.add(u4);
        expect.add(u2);
        assertThat(result, is(expect));
    }
    @Test
    public void sortNameAndAgeTest() {
        SortUser sortNameAndAgeTestComp = new SortUser();
        User u0 = new User("aaa", 23);
        User u1 = new User("aaa", 21);
        User u2 = new User("bbb", 45);
        User u3 = new User("bbb", 12);
        User u4 = new User("bbb", 31);
        List<User> list3 = new ArrayList<>();
        list3.add(u4);
        list3.add(u0);
        list3.add(u3);
        list3.add(u2);
        list3.add(u1);
        List<User> result = sortNameAndAgeTestComp.sortNameAndAge(list3);
        List<User> expect = new ArrayList<>();
        expect.add(u1);
        expect.add(u0);
        expect.add(u3);
        expect.add(u4);
        expect.add(u2);
        assertThat(result, is(expect));
    }


}
