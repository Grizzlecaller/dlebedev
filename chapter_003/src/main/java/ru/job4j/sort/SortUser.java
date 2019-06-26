package ru.job4j.sort;

import java.util.*;

/**
 * Class SortUser
 * @author Dmitry Lebedev
 * @since 05.06.2019
 */

public class SortUser {
    public Set<User> sortName(List<User> list) {
        TreeSet<User> result = new TreeSet<>(list);
        return result;
    }

    public List<User> sortNameLenght(List<User> list1) {
        Collections.sort(list1, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                final int name = o1.getName().compareTo(o2.getName());
                return  name;
            }
        }
        );

        return list1;
    }

    public List<User> sortAge(List<User> list2) {
        Collections.sort(list2, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                final int age = Integer.compare(o1.getAge(), o2.getAge());
                return age;
            }
        });
        return list2;
    }

    public List<User> sortNameAndAge(List<User> list3) {
        Collections.sort(list3, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                final int nameAndAge = o1.getName().compareTo(o2.getName());
                return nameAndAge != 0 ? nameAndAge : Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return list3;
    }
}