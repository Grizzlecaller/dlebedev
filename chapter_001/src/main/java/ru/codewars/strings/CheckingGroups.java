package ru.codewars.strings;

/**
 * Class CheckingGroups
 * @author Dmitry Lebedev
 * @since 03.09.2019
 */

class CheckingGroups {
     boolean groupCheck(String s) {
        boolean result = false;
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) == '(' && s.charAt(length - i - 1) == ')') {
                result = true;
            } else if (s.charAt(i) == '[' && s.charAt(length - i - 1) == ']') {
                result = true;
            } else if (s.charAt(i) == '{' && s.charAt(length - i - 1) == '}') {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
