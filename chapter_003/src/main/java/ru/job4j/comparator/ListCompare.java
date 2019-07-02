package ru.job4j.comparator;

/**
 * Class ListCompare
 * @author Dmitry Lebedev
 * @since 30.06.2019
 */

import java.util.Comparator;


public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int i = 0;
        int minSize = Math.min(left.length(),right.length());
        do {
            int compareChar = Character.compare(left.charAt(i), right.charAt(i));
            if (compareChar != 0) {
                result = compareChar;
                break;
            }
            i++;
        } while (i != minSize);

        return result == 0 ? Integer.compare(left.length(), right.length()) : result;
    }
}