package ru.job4j.sort;

import ru.job4j.list.ConvertList2Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class User
 * @author Dmitry Lebedev
 * @since 05.06.2019
 */

public class User implements Comparable<User> {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public int compareTo(User o) {
        int rsl = Integer.compare(this.age, o.age);
        return rsl != 0 ? rsl : this.name.compareTo(o.name);
    }

}
