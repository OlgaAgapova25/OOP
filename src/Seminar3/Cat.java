package Seminar3;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Cat o) {
        int result = this.getName().compareTo(o.getName());
        return result;
    }

    public void compareCats(Cat o2){
        int result = this.compareTo(o2);
        if (result == 0) System.out.println(this.getName() + " equal to " + o2.getName());
        if (result > 0) System.out.println(this.getName() + " is more than  " + o2.getName());
        if (result < 0) System.out.println(this.getName() + " is less than  " + o2.getName());
    }
}
