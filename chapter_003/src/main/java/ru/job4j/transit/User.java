package ru.job4j.transit;

import java.util.Objects;

/**
 * Class User
 * @author Dmitry Lebedev
 * @since 10.07.2019
 */

public class User implements Comparable<User> {
    private final String name;
    private final String passport;

    User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object obj) {
        boolean valid = false;
        if (obj != null) {
            if (this == obj) {
                valid = true;
            }
            if (!valid && getClass() == obj.getClass()) {
                User user = (User) obj;
                if (this.name != null && this.passport != null && user.name != null && user.passport != null) {
                    valid = this.name.equals(user.name) && this.passport.equals(user.passport);
                }
            }
        }
        return valid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }

    @Override
    public int compareTo(User user) {
        int valid = this.name.compareTo(user.name);
        return valid == 0 ? this.passport.compareTo(user.passport) : valid;
    }
}
