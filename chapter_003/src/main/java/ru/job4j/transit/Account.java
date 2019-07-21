package ru.job4j.transit;

import java.util.Objects;

/**
 * Class Account
 * @author Dmitry Lebedev
 * @since 10.07.2019
 */

public class Account {
    private double value;
    private String requisites;

    public Account(int value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return this.value;
    }

    public String getRequisites() {
        return this.requisites;
    }

    public void subAmount(double amount) {
        this.value -= amount;
    }

    public void addAbount(double amount) {
        this.value += amount;
    }

    @Override
    public boolean equals(Object obj) {
        boolean valid = false;
        if (obj != null) {
            if (this == obj) {
                valid = true;
            }
            if (!valid && getClass() == obj.getClass()) {
                Account account = (Account) obj;
                if (this.requisites != null && account.requisites != null) {
                    valid = this.requisites.equals(account.requisites);
                }
            }
        }
        return valid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, requisites);
    }

    public String toString() {
        return "Account{" + "values=" + value + ", reqs='" + requisites + "\\" + "}";
    }
}
