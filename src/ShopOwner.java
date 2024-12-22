import java.util.HashMap;
import java.util.Map;

public class ShopOwner implements Observer {
    Map<String, Integer> sales;
    TShirtShop shop;

    public ShopOwner(TShirtShop s) {
        s.addObserver(this);
        shop = s;
        sales = new HashMap<>();
    }

    @Override
    public void update(String arg) {
        sales.put(arg, sales.getOrDefault(arg, 0) + 1);
    }

    public void printSales() {
        for(Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
