package ru.job4j.finaltest;

import java.util.Objects;

/**
 * Class Department
 * @author Dmitry Lebedev
 * @since 16.08.2019
 */

public class Department implements Comparable<Department> {

    private String name;

    Department(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Department o) {
        int valid = this.name.compareTo(o.getName());
        return valid;
    }

    @Override
    public boolean equals(Object obj) {
        boolean valid = false;
        if (obj != null) {
            if (this == obj) {
                valid = true;
            }
            if (!valid && getClass() == obj.getClass()) {
                Department department = (Department) obj;
                if (this.name != null && department.name != null) {
                    valid = this.name.equals(department.name);
                }
            }
        }
        return valid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
