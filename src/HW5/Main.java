package HW5;

import HW5.model.BottleOfWater;
import HW5.service.VendingMachineImpl;
import HW5.view.UserView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BottleOfWater> bottles = new ArrayList<>(Arrays.asList(
                new BottleOfWater("Aqua", 12.0, 500),
                new BottleOfWater("Evian", 50.0, 500),
                new BottleOfWater("Panna", 35, 350)));
        VendingMachineImpl vM = new VendingMachineImpl(bottles);
        UserView userView = new UserView();
        String chooseProduct = userView.chooseProductName();
        System.out.println(vM.getProduct(chooseProduct).toString());
    }
}
