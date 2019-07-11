package ru.job4j.transit;

import java.util.Objects;

/**
 * Class User
 * @author Dmitry Lebedev
 * @since 10.07.2019
 */

public class User {
    private final String name;
    private final int passport;

    public User(String name, int passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public int getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name)
                && Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }
}
