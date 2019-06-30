package ru.job4j.comparator;

import java.util.Comparator;


public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int i = 0;
        int minSize = Math.min(left.length(),right.length());
        do {
            if(left.charAt(i) < right.charAt(i)) {
                result = -1;
                i++;
                break;
            } else if(left.charAt(i) > right.charAt(i)) {
                result = 1;
                i++;
                break;
            }
            i++;
        } while (i != minSize);
        if (result == 0) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}