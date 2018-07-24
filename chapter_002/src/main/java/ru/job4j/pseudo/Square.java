package ru.job4j.pseudo;

/**
 * Class Square
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 23.07.2018
 */

public class Square implements Shape {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("++++");
        pic.append("+     +");
        pic.append("+     +");
        pic.append("++++");
        return pic.toString();
    }
}
