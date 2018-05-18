package ru.job4j.OOPCar;

public class Car {
    private double volume;

    public void drive(int kilometer) {
        this.volume = this.volume - kilometer;
    }

    public void fill(int gas) {
        this.volume = this.volume + 10 * gas;
    }

    public boolean canDrive() {
        boolean result = this.volume > 0;
        return result;
    }

    public void gasInfo() {
        System.out.println("i can drive " + this.volume + " kilometers");
    }
}