package Domain;

public class Product {

    private int place;

    private String name;

    private double price;

    public Product(int place, String name, double price) {
        setPlace(place);

        setName(name);

        setPrice(price);
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "place=" + place +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


