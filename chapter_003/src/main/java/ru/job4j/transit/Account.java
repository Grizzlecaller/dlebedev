package ru.job4j.transit;

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

    public boolean transfer(Account destination, double amount) {
        boolean result = false;
        if (amount > 0 && amount < this.value && destination != null) {
            this.value -= amount;
            destination.value += amount;
            result = true;
        }
        return result;
    }

    public String toString() {
        return "Account{" + "values=" + value + ", reqs='" + requisites + "\\" + "}";
    }
}
