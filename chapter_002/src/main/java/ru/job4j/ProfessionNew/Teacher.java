package ru.job4j.ProfessionNew;

import java.sql.Struct;

/**
 * Class Teacher
 * @author Dmitry Lebedev
 * @since 11.05.2018
 */

public class Teacher extends Profession {

    public Diplom teach(Student student) {
        Diplom diplom = new Diplom();
        return diplom;
    }
}
