package ru.job4j.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Class ConvertList2Map
 * @author Dmitry Lebedev
 * @since 26.04.2019
 */

public class ConvertList2Map {

    static class User {
        private final String name;
        private final String city;
        private final Integer id;

        User(String name, String city, Integer id) {
            this.name = name;
            this.city = city;
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name) &&
                    Objects.equals(city, user.city) &&
                    Objects.equals(id, user.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, city, id);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    ", id=" + id +
                    '}';
        }


    }

    static class UserConvert {
        public HashMap<Integer, User> process(List<User> list) {

            return null;
        }
    }


}
