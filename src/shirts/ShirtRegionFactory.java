package shirts;

import shirts.asia.AsiaShirtFactory;
import shirts.china.ChinaShirtFactory;
import shirts.middle_east.MiddleEastShirtFactory;

public class ShirtRegionFactory {
    public ShirtFactory createShirtFactory(String region) {
        return switch (region) {
            case "asia" -> new AsiaShirtFactory();
            case "china" -> new ChinaShirtFactory();
            case "middle_east" -> new MiddleEastShirtFactory();
            default -> throw new IllegalArgumentException("Unrecognized region: " + region);
        };
    }
}
