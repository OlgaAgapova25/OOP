package Seminar4;

import java.util.ArrayList;
import java.util.List;

public class NewVendingMachine<T extends Product>{
    private List<T> products = new ArrayList<T>();
    public NewVendingMachine (List<T> products) {this.products = products;}
    void initProduct(List<T> products) {
        this.products = products;

    }
    public T getProduct(String name) {
        for(T product: products){
            if(product instanceof T){
                if(product.getName().equalsIgnoreCase(name)){
                    return product;
                }
            }

        }
        throw new IllegalStateException(String.format("РџСЂРѕРґСѓРєС‚ c РЅР°Р·РІР°РЅРёРµРј %s РЅРµ РЅР°Р№РґРµРЅ.", name));
    }
}
