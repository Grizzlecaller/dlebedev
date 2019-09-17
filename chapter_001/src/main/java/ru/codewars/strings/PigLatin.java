package ru.codewars.strings;

/**
 * Class PigLatin
 * @author Dmitry Lebedev
 * @since 16.09.2019
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
 */

class PigLatin {

    static String pigIt(String str) {
        //String delimeter = " ";
        String[] subStr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        String punctuationals = "!<>,.?/|@#$%^&*()_+-";
        for (String tmpStr : subStr) {
            char[] ch = tmpStr.toCharArray();
            char tmp = ch[0];
            for (int j = 0; j < ch.length - 1; j++) {
                ch[j] = ch[j + 1];
            }
            ch[ch.length - 1] = tmp;
            for (char tmpC : ch ) {
                sb.append(tmpC);
            }
            if (punctuationals.contains(tmpStr)) {
                sb.append(tmpStr);
            } else {
                sb.append("ay").append(" ");
            }
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
