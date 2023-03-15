package HW1;

public class HotDrinks  extends Product {
    private String name;
    private int volume;
    private int temp;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public HotDrinks(String name, int volume, int temp) {
        this.name = name;
        this.volume = volume;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", temp=" + temp +
                '}';
    }
}
