package ru.job4j.converter;

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
        value = value / 70;
        return value;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        value = value / 60;
        return value;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value рубли.
     * @return Доллоры
     */
    public int dollarToRuble(int value) {
        value = value * 60;
        return value;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value рубли.
     * @return Доллоры
     */
    public int euroToRuble(int value) {
        value = value * 70;
        return value;
    }
}
