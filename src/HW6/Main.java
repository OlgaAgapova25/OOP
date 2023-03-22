package HW6;

import HW6.model.BottleOfWater;
import HW6.model.BottleOfWaterBuilder;
import HW6.service.VendingMachineImpl;
import HW6.view.UserView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BottleOfWater bottle1 = BottleOfWaterBuilder.getInstance().setName("Aqua").setCost(12.0).setVolume(500).build();
        BottleOfWater bottle2 = BottleOfWaterBuilder.getInstance().setName("Nestea").setCost(15.0).setTaste("Berries").setVolume(500).build();
        BottleOfWater bottle3 = BottleOfWaterBuilder.getInstance().setName("Panna").setCost(15.0).setGas(true).build();
        List<BottleOfWater> bottles = new ArrayList<>(Arrays.asList(bottle1,bottle2,bottle3));
        VendingMachineImpl vM = new VendingMachineImpl(bottles);
        UserView userView = new UserView();
        String chooseProduct = userView.chooseProductName();
        System.out.println(vM.getProduct(chooseProduct).toString());
    }
}
