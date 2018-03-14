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
    private static final double MAN_WEIGHT = 100;
    private static final double WOMAN_WEIGHT = 110;
    private static final double HUMAN_COEF = 1.15;


    double manWeight(double height) {
        return (height - MAN_WEIGHT) * HUMAN_COEF;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return (height - WOMAN_WEIGHT) * HUMAN_COEF;
    }
}
