package ru.job4j.TestingOOP;

public class Students extends Institute {
    public static int Course;
    public Students(String Name, int Age, int Course) {
        super(Name, Age, Height);
        this.Course = Course;
    }
    void tell() {
        System.out.println("Name : " + Institute.Name);
        System.out.println("Age : " + Institute.Age);
        System.out.println("Course : " + Course);
    }
}
