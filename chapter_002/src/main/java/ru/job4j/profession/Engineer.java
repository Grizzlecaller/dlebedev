package ru.job4j.profession;

/**
 * Class Engineer
 * @author Dmitry Lebedev
 * @since 11.05.2018
 */

public class Engineer extends Profession {

    public House build() {
        House house = new House();
        return house;
    }
}
