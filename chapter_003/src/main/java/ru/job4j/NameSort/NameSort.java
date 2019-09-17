package ru.job4j.NameSort;

import java.util.*;

/**
 * Class NameSort
 * @author Dmitry Lebedev
 * @since 10.09.2019
 */

public class NameSort<strings> {

    List<String> strings = Arrays.asList(
            "Иванов", "Иванкин", "Ивченко", "Лавриенко", "Лавочкин", "Абрамов", "Абдулов", "Акрин", "Циганов");
    strings.sort((o1, o2) -> {
        int firstCharComparison = o1.charAt(0) - o2.charAt(0);
        int secondCharComparison = -String.CASE_INSENSITIVE_ORDER.compare(o1.substring(1), o2.substring(1));
        return firstCharComparison != 0 ? firstCharComparison : secondCharComparison;
    });
System.out.println(strings);

}
