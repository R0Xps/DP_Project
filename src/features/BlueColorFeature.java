package features;

import shirts.Shirt;

public class BlueColorFeature extends Feature {

    public BlueColorFeature(Shirt shirt) {
        super(shirt);
    }

    @Override
    public String getDescription() {
        return shirt.getDescription() + ", blue color";
    }
}
