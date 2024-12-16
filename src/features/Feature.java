package features;

import shirts.Shirt;

public abstract class Feature extends Shirt {
    Shirt shirt;

    public Feature(Shirt shirt) {
        this.shirt = shirt;
    }

    @Override
    public abstract String getDescription();

    @Override
    public void formSize() {
        shirt.formSize();
    }
}