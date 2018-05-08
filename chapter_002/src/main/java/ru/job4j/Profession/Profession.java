package ru.job4j.Profession;

/**
 * Class Profession
 * @author Dmitry Lebedev
 * @since 08.05.2018
 */

public class Profession {

    public String name;

    public String profession;

    public Profession() {

    }

    public Profession(String name, String profession){
        this.name = name;
        this.profession = profession;
    }

    public String getName() {
        return this.name;
    }

    public String getProfession() {
        return this.profession;
    }
}
