package Seminar6;

public class Worker {
    private String name;
    private int salary;
    private int age;
    private boolean vacation;
    private short cabinet;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVacation() {
        return vacation;
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }

    public short getCabinet() {
        return cabinet;
    }

    public void setCabinet(short cabinet) {
        this.cabinet = cabinet;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", vacation=" + vacation +
                ", cabinet=" + cabinet +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
