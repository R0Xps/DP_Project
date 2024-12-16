package features;

import shirts.Shirt;

public class RedColorFeature extends Feature {

    public RedColorFeature(Shirt shirt) {
        super(shirt);
    }

    @Override
    public String getDescription() {
        return shirt.getDescription() + ", red color";
    }
}
