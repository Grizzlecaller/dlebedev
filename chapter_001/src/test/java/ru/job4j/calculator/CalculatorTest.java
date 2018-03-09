package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    public void whenAddEightMinusOneThenSeven() {
        Calculator calc = new Calculator();
        calc.subtruct(8D, 1D);
        double result = calc.getResult();
        double expected = 7D;
        assertThat(result, is(expected));
    }
    public void whenAddTenDivTwoThenFive() {
        Calculator calc = new Calculator();
        calc.div(10D, 2D);
        double result = calc.getResult();
        double expected = 5D;
        assertThat(result, is(expected));
    }
    public void whenAddFourMultTwoThenEight() {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 8D;
        assertThat(result, is(expected));
    }
}