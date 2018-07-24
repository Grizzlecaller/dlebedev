package ru.job4j.pseudo;

/**
 * Class Triangle
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 23.07.2018
 */


public class Triangle implements Shape {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   +   ");
        pic.append("  + +  ");
        pic.append(" +   + ");
        pic.append("+++++++");
        return pic.toString();
    }
}
