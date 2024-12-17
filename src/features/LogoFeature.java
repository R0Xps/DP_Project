package features;

import shirts.TShirt;

public class LogoFeature extends Feature {

    public LogoFeature(TShirt tShirt) {
        super(tShirt);
    }

    @Override
    public String getDescription() {
        return tShirt.getDescription() + ", with bird logo";
    }
}
