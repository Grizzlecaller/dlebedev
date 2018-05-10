package ru.job4j.TestingOOP;

public class Lectors extends Institute {
    public static int WorkExperience;
    public static String Direction;

    public Lectors(String Name, int Age, int Height, int WorkExperience, String Direction) {
        super(Name, Age, Height);
        this.WorkExperience = WorkExperience;
        this.Direction = Direction;
    }
    void tell() {
        System.out.println("Name : " + Institute.Name);
        System.out.println("Age : " + Institute.Age);
        System.out.println("Course : " + Institute.Height);
        System.out.println("Work Experience: " + WorkExperience);
        System.out.println("Direction : " + Direction);
    }

}
