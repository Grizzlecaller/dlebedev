package ru.codewars.strings;

class IsogramNew {
    static boolean isIsogram(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.toCharArray()[i] == str.toCharArray()[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
