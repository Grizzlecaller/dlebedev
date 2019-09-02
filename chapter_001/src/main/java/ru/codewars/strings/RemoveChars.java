package ru.codewars.strings;

/**
 * Class RemoveChars
 * @author Dmitry Lebedev
 * @since 02.09.2019
 */


class RemoveChars {
    static String remove(String str) {

        /*StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i < str.length() - 1) {
                sb.append(str.charAt(i));
            }
        }*/

        return str.length() > 0 ? str.substring(1, str.length() - 1) : str;
    }
}
