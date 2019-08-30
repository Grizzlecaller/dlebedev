package ru.codewars.strings;

class Kata {
    static String getMiddle(String word) {
        StringBuilder t = new StringBuilder();
        if (word.length() % 2 == 0) {
            t.append(word.charAt((word.length() / 2) - 1)).append(word.charAt((word.length() / 2)));
        } else {
            t.append(word.charAt((word.length() / 2)));
        }
        return t.toString();
    }
}
