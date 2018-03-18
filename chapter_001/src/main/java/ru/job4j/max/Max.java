package ru.job4j.max;
/**
 * Class Max
 * @author Dmitry Lebedev
 * @since 18.03.2018
 */

public class Max{
    /**
     * maximum принимает значение true или false в зависимости от сравнения
     */
    private boolean maximum;
    public int max(int first, int second){
        if (first > second){
            boolean maximum = true;
        } else {
            boolean maximum = false;
        }
        /**
         * возвращаем значение тентарного условия
         */
        return maximum ? first : second;
    }

}