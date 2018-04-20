package ru.job4j.testingCode;

public class TestingMethods {
    public static  void doSmth(Integer a, Integer b) {
        a += 5;
        b += 5;
        System.out.println(   "a = " + a
                            + " ,b = " + b);
    }

    public static void main (String[] args) {
        Integer x = 1000;
        int y = 20;
        x.equals(y);
        doSmth(x, y);
        System.out.println("x = " + x
                            + " ,y = " + y);
    }
}


