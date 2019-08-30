package ru.job4j.array;

class Isogram {
    static String disemvowel(String str) {
        return str.replaceAll("[AEIOUaeiou]", "");
    }
}