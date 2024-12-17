package features;

import shirts.TShirt;

public class ColorFeature extends Feature {
    Color color;

    public ColorFeature(TShirt tShirt, Color color) {
        super(tShirt);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return tShirt.getDescription() + ", " + color.toString().toLowerCase() + " color";
    }
}
