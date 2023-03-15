package HW1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine extends VendingMachine{
    List <HotDrinks> products = new ArrayList<>();
    void initProduct(List<HotDrinks> products) {
        this.products = products;

    }

    @Override
    String getProduct(String name, int volume, int temperature) {
        for (HotDrinks p: products){
            if(p.getName().equals(name) && p.getVolume() == volume && p.getTemp() == temperature) {
                return p.getName() + " " + p.getVolume() + " " + p.getTemp();
            }
        }
        return new HotDrinks("Not found", 0, 0).toString();
    }
}
