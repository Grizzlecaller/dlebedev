package ru.codewars.strings;

import static java.util.stream.IntStream.of;

/**
 * Class PredictYourAge
 * @author Dmitry Lebedev
 * @since 02.09.2019
 */

class PredictYourAge {
    /*static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int a = age1 * age1;
        int b = age2 * age2;
        int c = age3 * age3;
        int d = age4 * age4;
        int e = age5 * age5;
        int f = age6 * age6;
        int g = age7 * age7;
        int h = age8 * age8;
        double re = Math.sqrt(a+b+c+d+e+f+g+h)/2;
        return (int) re;
    }*/

    static int predictAge(int ... ages) {
        return (int) Math.sqrt(of(ages).map(i -> i * i).sum()) / 2;
    }
}
