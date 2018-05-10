package ru.job4j.Profession;

/**
 * Class Doctor
 * @author Dmitry Lebedev
 * @since 08.05.2018
 */

public class Doctor extends Profession {

    public Doctor() {
    }
    public String getName() {
        return super.getName();
    }
    public String getProfession() {
        return super.getProfession();
    }
    public String Diagnose;

    /*public Diagnose heal(Pacient pacient) {
    }*/



    public String getDiagnose() {
        return this.Diagnose;
    }

}
