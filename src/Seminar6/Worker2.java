package Seminar6;

public class Worker2 {
    private String name;
    private short cabinet;
    private byte age;
    private float salary;
    private String lastName;
    private int points;

    public Worker2(String name, short cabinet, byte age, float salary) {
        this.name = name;
        this.cabinet = cabinet;
        this.age = age;
        this.salary = salary;
    }

    public Worker2(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Worker2(short cabinet) {
        this.cabinet = cabinet;
    }

    public Worker2(byte age) {
        this.age = age;
    }

    public Worker2(float salary) {
        this.salary = salary;
    }
}
