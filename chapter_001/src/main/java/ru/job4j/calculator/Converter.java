package ru.job4j.calculator;

/**
 * Class Converter 0.1
 * @author dlebedev
 * @since 010.03.2018
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value рубли.
     * @return Доллоры
     */
    public int dollarToRuble(int value) {
        return value * 60;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value рубли.
     * @return Доллоры
     */
    public int euroToRuble(int value) {
        return value * 70;
    }
}
