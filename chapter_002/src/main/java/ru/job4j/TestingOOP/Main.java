package ru.job4j.TestingOOP;

public class Main {
    public static void main(String[] args) {

        Students firstCourse = new Students("Alex", 19, 2);
        firstCourse.tell();
        System.out.println("-------------");
        Lectors Max = new Lectors("Max", 36, 176, 10, "History");
        Max.tell();
    }
}
