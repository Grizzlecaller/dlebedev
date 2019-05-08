package ru.job4j.list;

import java.util.*;

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

        public class UserConvert {
            public HashMap<Integer, User> process(List<User> list) {
                HashMap<Integer, User> hMap = new HashMap<>();
                int i = 0;
                for (User tmp : list) {
                    hMap.put(id, tmp);
                }
                return hMap;
            }
        }

        public static void main(String[] args) {
            List<User> tmpUser = new ArrayList<User>();
            tmpUser.addAll(Arrays.asList(
                    new User("test", "test", 0),
                    new User("test1", "test1", 1),
                    new User("test2", "test2", 2)
                    )
            );

            for (User tmp : tmpUser) {
                System.out.println(tmp);
            }
            System.out.println("---------------");

            Map<Integer, User> map = new HashMap<Integer, User>();
            for (User tmp : tmpUser) {
                map.put(tmp.id, tmp);
            }

            for (int i = 0; i < map.size(); i++) {
                System.out.println(map.get(i));
            }
            System.out.println("---------------");

            Map<Integer, User> realMap = new HashMap<Integer, User>();


            realMap.put(0, new User("test", "test", 0));
            realMap.put(1, new User("test1", "test1", 1));
            realMap.put(2, new User("test2", "test2", 2));

            for (int i = 0; i < map.size(); i++) {
                System.out.println(map.get(i));
            }
            System.out.println("---------------");

            if (realMap.equals(map)) {
                System.out.println("all right!");
            }
        }
    }
}
