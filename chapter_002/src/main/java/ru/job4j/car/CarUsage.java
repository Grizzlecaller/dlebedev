package ru.job4j.car;

public class CarUsage {
    public static void main(String[] args) {
        Car audi = new Car();
        boolean driving = audi.canDrive();
        System.out.println("Can you drive?:" + driving);
        System.out.println("i`m going to a gas station.");
        int gas = 25;
        audi.fill(gas);
        driving = audi.canDrive();
        System.out.println("Can you drive now? :" + driving);
        System.out.println("Yes");
        System.out.println("10 km");
        int distance = 10;
        audi.drive(distance);
        audi.gasInfo();
    }
}
