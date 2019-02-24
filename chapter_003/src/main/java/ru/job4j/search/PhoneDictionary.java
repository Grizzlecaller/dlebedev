package ru.job4j.search;

/**
 * Class TrackerTest
 * @author Dmitry Lebedev
 * @since 23.02.2019
 */

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person tmp : persons) {
                if (tmp.getAddress() == key || tmp.getName() == key || tmp.getPhone() == key || tmp.getSurname() == key) {
                    result.add(tmp);
                } else {
                    result.add(new Person("", "", "", ""));
                }
        }
        return result;
    }
}