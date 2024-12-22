import features.FeatureFactory;
import shirts.TShirt;

import java.util.List;


public class Customer {

    TShirtShop shop;
    FeatureFactory featureFactory;
    boolean ordered = false;

    public Customer(){
        shop = TShirtShop.getInstance();
        featureFactory = new FeatureFactory();
    }

    public TShirt order(String region, String size, List<String> features) {

        if(ordered) throw new UnsupportedOperationException("Customer already ordered");

        ordered = true;
        TShirt shirt = shop.order(region, size);
        for(String feature : features){
            shirt = featureFactory.createFeature(feature, shirt);
        }

        return shirt;
    }

}
