package features;

import shirts.Shirt;

public class TextFeature extends Feature {

    public TextFeature(Shirt shirt) {
        super(shirt);
    }

    @Override
    public String getDescription() {
        return shirt.getDescription() + ", with \"nice day!\" text";
    }
}
