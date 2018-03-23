package ru.job4j.loop;
/**
 * Class loop 0.1
 * @author Dmitry Lebedev
 * @since 21.03.2018
 */

public class Counter {
    public int add(int start, int finish) {
        int alfa = 0;
        for(int i = start; i <= finish; i++){
            if (i % 2 == 0) {
                /*
                 *alfa принимает значение i, когда i кратно 2
                 */
                alfa += i;
            }
        }
        return alfa;
    }
}