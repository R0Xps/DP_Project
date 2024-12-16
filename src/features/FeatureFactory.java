package features;

import shirts.Shirt;

public class FeatureFactory {
    public Feature createFeature(String feature, Shirt shirt) {
        return switch (feature) {
            case "logo" -> new LogoFeature(shirt);
            case "text" -> new TextFeature(shirt);
            case "color_red" -> new RedColorFeature(shirt);
            case "color_blue" -> new BlueColorFeature(shirt);
            default -> throw new IllegalArgumentException("Unrecognized feature: " + feature);
        };
    }
}
