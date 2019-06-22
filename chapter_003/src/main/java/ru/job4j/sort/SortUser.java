package ru.job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class SortUser
 * @author Dmitry Lebedev
 * @since 05.06.2019
 */

public class SortUser {
    public Set<User> sort (List<User> list) {
        TreeSet<User> result = new TreeSet<>();
        result.addAll(list);
        return result;
    }
}