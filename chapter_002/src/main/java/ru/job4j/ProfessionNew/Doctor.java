package ru.job4j.ProfessionNew;

import javax.print.Doc;

/**
 * Class Doctor
 * @author Dmitry Lebedev
 * @since 11.05.2018
 */

public class Doctor extends Profession {

    public Diagnose heal(Pacient pacient) {
        Diagnose diagnose = new Diagnose();
        return diagnose;
    }
}
