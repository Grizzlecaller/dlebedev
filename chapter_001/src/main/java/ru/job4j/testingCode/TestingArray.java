package ru.job4j.testingCode;

public class TestingArray {


    public static void main(String[] args) {

        int[] arrayOne = new int[] {1, 2, 3, 4, 5};
        int[] arrayTwo = new int[] {10, 20, 30, 40, 50};
        int[] arrayFin = new int[arrayOne.length + arrayTwo.length];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayFin[i] = arrayOne[i];
        }
        for (int j = 0; j < arrayTwo.length; j++) {
            arrayFin[arrayOne.length +j] = arrayTwo[j];
        }
        for (int x = 0; x < arrayFin.length; x++) {
            System.out.println(arrayFin[x]);
        }
    }
}
