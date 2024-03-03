package Domain;

public class Drinks extends Product {
    private float volume;

    public Drinks(int place, String name, double price, float volume) {
        super(place, name, price);
        this.volume = volume;
    }
    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString(){
        return super.toString() + " " + "volume" + volume + " ";
    }
}
