import Domain.Drinks;
import Domain.HotDrinks;
import Domain.Product;
import Service.CoinDispencer;
import Service.Display;
import Service.Holder;
import Service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception{
        Product item1 = new Product(1, "Snickers", 55);
        Product item2 = new Product(2, "Mars", 40);
        Product item3 = new Product(3, "Twix", 70);
        Product item4 = new Drinks(5, "Sprite", 50, 0.5f);
        Product item5 = new Drinks(7, "Mineral", 30, 0.5f);
        Product item6 = new HotDrinks(1, "Coffee", 45, 0.5f, 93);
        Product item7 = new HotDrinks(1, "Tea", 35, 0.5f, 80);

        List<Product> products = new ArrayList<>();
        products.add(item1);
        products.add(item2);
        products.add(item3);
        products.add(item4);
        products.add(item5);
        products.add(item6);
        products.add(item7);

        Holder hold = new Holder();
        CoinDispencer coin = new CoinDispencer();
        Display display = new Display();
        VendingMachine vendingMachine = new VendingMachine(hold, coin, display, products);

        for (Product prod : vendingMachine.getListProduct()){
            System.out.println(prod);
        }
    }
}
