package HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        HotDrinksMachine hDM = new HotDrinksMachine();
        List<HotDrinks> hotDrinks = new ArrayList<>(Arrays.asList(new HotDrinks("tea", 250, 85),
                new HotDrinks("coffee", 150, 80),
                new HotDrinks("coffee", 250, 80),
                new HotDrinks("tea", 300, 80)));
        hDM.initProduct(hotDrinks);
        System.out.println(hDM.getProduct("tea", 300, 80).toString());
    }
}