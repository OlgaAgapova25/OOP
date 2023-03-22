package HW6.model;

public class BottleOfWaterBuilder {
    private static BottleOfWaterBuilder instance = null;
    BottleOfWater obj;
    private BottleOfWaterBuilder(){}

    public static BottleOfWaterBuilder getInstance(){
        if (instance == null)
    instance = new BottleOfWaterBuilder();
    instance.obj = new BottleOfWater();
    return instance;
    }
    public BottleOfWaterBuilder setName (String name){
        obj.setName(name);
        return this;
    }
    public BottleOfWaterBuilder setCost (double cost){
        obj.setCost(cost);
        return this;
    }
    public BottleOfWaterBuilder setVolume (int volume){
        obj.setVolume(volume);
        return this;
    }
    public BottleOfWaterBuilder setTaste (String taste){
        obj.setTaste(taste);
        return this;
    }
    public BottleOfWaterBuilder setGas (boolean gas){
        obj.setGas(gas);
        return this;
    }
    public BottleOfWater build() {return obj;}

    @Override
    public String toString() {
        return "BottleOfWaterBuilder{" +
                "obj=" + obj +
                '}';
    }
}
