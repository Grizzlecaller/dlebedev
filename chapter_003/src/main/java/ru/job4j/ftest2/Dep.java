package ru.job4j.ftest2;

/**
 * Class Dep
 * @author Dmitry Lebedev
 * @since 21.08.2019
 */

public class Dep {

    private String name;

    Dep(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public int getLength() {
        return this.name.length();
    }

}
