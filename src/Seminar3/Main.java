package Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("barsik"), new Cat("murzik"), new Cat("tima")));
        Iterator<Cat> itr = cats.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().getName());
        }
        Cat newCat1 = new Cat("murka");
        Cat newCat2 = new Cat("matilda");
        newCat1.compareCats (newCat2);
    }
}
