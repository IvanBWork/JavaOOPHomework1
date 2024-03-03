package Domain;

public class HotDrinks extends Drinks{

    private int temperature;

    public HotDrinks(int place, String name, double price, float volume, int temperature) {
        super(place, name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "temperature " + temperature + "c";
    }
}
