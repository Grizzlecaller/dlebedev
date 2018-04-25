package ru.job4j.loop;
/**
 * Class loop 0.1
 * @author Dmitry Lebedev
 * @since 21.03.2018
 */

public class Factorial {
    public int calc(int n) {
        /*
         * @param fResult = 1, т.к. умножение на 0 всегда даёт ноль.
         */
        int fResult = 1;
        /*
         * @param i = 1, т.к. умножение на 0 всегда даёт ноль.
         */
        for (int i = 1; i <= n; i++) {
            /*
             * @param fResult = fResult * i
             */
            fResult *= i;
        }
        return fResult;
    }
}