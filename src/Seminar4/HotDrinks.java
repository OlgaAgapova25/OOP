package Seminar4;

public class HotDrinks  extends Product {
    private int volume;
    private int temp;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public HotDrinks(String name, double cost, int volume, int temp) {
       super (name, cost);
        this.volume = volume;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                "name='" + super.getName() + '\'' +
                ", volume=" + this.volume +
                ", temp=" + this.temp +
                '}';
    }
}