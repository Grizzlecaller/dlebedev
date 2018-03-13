package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     * @double объявление переменных
     */
    private double manConst = 100;
    private double womanConst = 110;
    private double humanCoef = 1.15;


    double manWeight(double height) {
        height = height - manConst;
        height = height * humanCoef;
        return height;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        height = height - womanConst;
        height = height * humanCoef;
        return height;
    }
}
