package features;

import shirts.TShirt;

public class TextFeature extends Feature {

    public TextFeature(TShirt tShirt) {
        super(tShirt);
    }

    @Override
    public String getDescription() {
        return tShirt.getDescription() + ", with \"nice day!\" text";
    }
}
