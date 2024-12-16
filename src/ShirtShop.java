import shirts.Shirt;
import shirts.ShirtFactory;
import shirts.ShirtRegionFactory;


public class ShirtShop extends Subject {
    private static ShirtShop shirtShopInstance;

    private ShirtShop() {
    }

    public static synchronized ShirtShop getInstance() {
        if(shirtShopInstance == null) shirtShopInstance = new ShirtShop();
        return shirtShopInstance;
    }

    public Shirt order(String region, String size) {
        ShirtRegionFactory shirtRegionFactory = new ShirtRegionFactory();
        ShirtFactory shirtFactory = shirtRegionFactory.createShirtFactory(region);
        Shirt shirt = shirtFactory.createShirt(size);
        notifyObservers(region + "-" + size);
        return shirt;
    }
}
