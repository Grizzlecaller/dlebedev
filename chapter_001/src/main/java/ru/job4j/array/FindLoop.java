package ru.job4j.array;

/**
 * Class Paint
 * @author Dmitry Lebedev
 * @since 03.04.2018
 */

public class FindLoop {
    public int indexOf(int[] data, int el) {
        /*
            @param rst = -1 если в элемента нет в массиве возвращает -1.
         */
        int rst = -1;
        for (int index = 0; index <= data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        } return rst;
    }
}
