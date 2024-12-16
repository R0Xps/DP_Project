import java.util.HashMap;
import java.util.Map;

public class ShopOwner implements Observer {
    Map<String, Integer> sales;

    public ShopOwner(Subject s) {
        s.addObserver(this);
        sales = new HashMap<>();
    }

    @Override
    public void update(Object arg) {
        String size = (String) arg;
        sales.put(size, sales.getOrDefault(size, 0) + 1);
    }

    public void printSales() {
        for(Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
