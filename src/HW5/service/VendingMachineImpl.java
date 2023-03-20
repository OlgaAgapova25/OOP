package HW5.service;

import HW5.model.BottleOfWater;

import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    private List<BottleOfWater> products;

    public VendingMachineImpl(List<BottleOfWater> products) {
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