package ru.job4j.ftest2;

import java.util.Comparator;

/**
 * Class DepCompare
 * @author Dmitry Lebedev
 * @since 21.08.2019
 */

public class DepCompare implements Comparator<Dep> {
    public int compare(Dep o1, Dep o2) {
        //if ()
        return o1.getName().compareTo(o2.getName());
    }
}
