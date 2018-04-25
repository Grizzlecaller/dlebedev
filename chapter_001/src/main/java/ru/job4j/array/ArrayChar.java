package ru.job4j.array;


/**
 * Class ArrayChar
 * @author Dmitry Lebedev
 * @since 10.04.2018
 */

public class ArrayChar {
    private char[] data;

    /**
     * @param line
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return result если слово начинается с префикса  result = true
     */
    public boolean startWith(String prefix) {
        /*
            @result принимает значение false только в случае несовпадения префикса и начала слова
         */
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (value[i] != (data[i])) {
                result = false;
            }
        } return result;
    }
}