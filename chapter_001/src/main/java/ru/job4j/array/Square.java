package ru.job4j.array;

/**
 * Class Paint
 * @author Dmitry Lebedev
 * @since 02.04.2018
 */

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
            for(int i = 1; i <= rst.length; i++){
                rst[i - 1] = i * i;
            }
        return rst;
    }
}
