package features;

import shirts.TShirt;

public class FeatureFactory {
    public Feature createFeature(String feature, TShirt tShirt) {
        return switch (feature) {
            case "logo" -> new LogoFeature(tShirt);
            case "text" -> new TextFeature(tShirt);
            case "color_red" -> new ColorFeature(tShirt, Color.RED);
            case "color_blue" -> new ColorFeature(tShirt, Color.BLUE);
            default -> throw new IllegalArgumentException("Unrecognized feature: " + feature);
        };
    }
}
