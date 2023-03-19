package Seminar4;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachine {
    private List<HotDrinks> products = new ArrayList<>();
    public HotDrinksMachine (List<HotDrinks> products) {this.products = products;}
    void initProduct(List<HotDrinks> products) {
        this.products = products;

    }
    public HotDrinks getProduct(String name) {
        for(HotDrinks product: products){
            if(product instanceof HotDrinks){
                if(product.getName().equalsIgnoreCase(name)){
                    return (HotDrinks) product;
                }
            }

        }
        throw new IllegalStateException(String.format("РџСЂРѕРґСѓРєС‚ c РЅР°Р·РІР°РЅРёРµРј %s РЅРµ РЅР°Р№РґРµРЅ.", name));
    }
    public HotDrinks getProduct(String name, int volume) {
        for(HotDrinks product: products){
            if(product instanceof HotDrinks){
                if(product.getName().equalsIgnoreCase(name) && ((HotDrinks) product).getVolume() == volume){
                    return (HotDrinks) product;
                }
            }

        }
        throw new IllegalStateException(String.format("РџСЂРѕРґСѓРєС‚ c РЅР°Р·РІР°РЅРёРµРј %s РЅРµ РЅР°Р№РґРµРЅ.", name));
    }
}
