package Seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BottleOfWater> bottles = new ArrayList<>(Arrays.asList(
                new BottleOfWater("Aqua", 12.0, 500),
                new BottleOfWater("Evian", 50.0, 500),
                new BottleOfWater("Panna", 35, 350)));
        NewVendingMachine vM = new NewVendingMachine(bottles);
        System.out.println(vM.getProduct("Aqua").toString());
        List<HotDrinks> cups = new ArrayList<>(Arrays.asList(
                new HotDrinks("tea", 25.0, 250, 80),
                new HotDrinks("coffee", 50.0, 200, 85)));
        NewVendingMachine vM1 = new NewVendingMachine(cups);
        System.out.println(vM1.getProduct("tea").toString());
    }
}
