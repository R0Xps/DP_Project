package features;

import shirts.TShirt;

public abstract class Feature extends TShirt {
    TShirt tShirt;

    public Feature(TShirt tShirt) {
        this.tShirt = tShirt;
    }

    @Override
    public abstract String getDescription();

    @Override
    public void formSize() {
        tShirt.formSize();
    }
}