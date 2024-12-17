import shirts.TShirt;
import shirts.TShirtFactory;
import shirts.TShirtRegionFactory;


public class TShirtShop extends Subject {
    private static TShirtShop tShirtShopInstance;
    TShirtRegionFactory tShirtRegionFactory;

    private TShirtShop() {
        tShirtRegionFactory = new TShirtRegionFactory();
    }

    public static synchronized TShirtShop getInstance() {
        if(tShirtShopInstance == null) tShirtShopInstance = new TShirtShop();
        return tShirtShopInstance;
    }

    public TShirt order(String region, String size) {
        TShirtFactory tShirtFactory = tShirtRegionFactory.createShirtFactory(region);
        TShirt tShirt = tShirtFactory.createShirt(size);
        notifyObservers(region + "_" + size);
        return tShirt;
    }
}
