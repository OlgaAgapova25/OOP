package Seminar4;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private List<BottleOfWater> products;

    public BottleOfWaterVendingMachine(List<BottleOfWater> products) {
        this.products = products;
    }

    public BottleOfWater getProduct(String name){
        for(BottleOfWater product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("РџСЂРѕРґСѓРєС‚ c РЅР°Р·РІР°РЅРёРµРј %s РЅРµ РЅР°Р№РґРµРЅ.", name));
    }

    public BottleOfWater getProduct(String name, int volume){
        for(BottleOfWater product: products){
            if(product instanceof BottleOfWater){
                if(product.getName().equalsIgnoreCase(name) && ((BottleOfWater) product).getVolume() == volume){
                    return (BottleOfWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("РџСЂРѕРґСѓРєС‚ c РЅР°Р·РІР°РЅРёРµРј %s РЅРµ РЅР°Р№РґРµРЅ.", name));
    }
}