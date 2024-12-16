package features;

import shirts.Shirt;

public class LogoFeature extends Feature {

    public LogoFeature(Shirt shirt) {
        super(shirt);
    }

    @Override
    public String getDescription() {
        return shirt.getDescription() + ", with bird logo";
    }
}
