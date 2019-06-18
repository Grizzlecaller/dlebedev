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

public class User implements Comparable {
    private final String name;
    private final String age;
    User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }
}
