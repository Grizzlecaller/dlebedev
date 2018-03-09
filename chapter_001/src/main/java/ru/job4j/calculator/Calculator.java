package ru.job4j.calculator;
/**
 * Class Calculator 0.1
 * @author dlebedev
 * @since 09.03.2018
 */

public class Calculator{
    private double result;

    public void add(double first, double second){
        this.result = first + second;
    }
    public void subtruct(double first, double second){
        this.result = first - second;
    }
    public void div(double first, double second){
        this.result = first / second;
    }
    public void multiple(double first, double second){
        this.result = first * second;
    }
    public double getResult(){
        return this.result;
    }
}