package shirts;

import shirts.asia.AsiaTShirtFactory;
import shirts.china.ChinaTShirtFactory;
import shirts.middle_east.MiddleEastTShirtFactory;

public class TShirtRegionFactory {
    public TShirtFactory createShirtFactory(String region) {
        return switch (region) {
            case "asia" -> new AsiaTShirtFactory();
            case "china" -> new ChinaTShirtFactory();
            case "middle_east" -> new MiddleEastTShirtFactory();
            default -> throw new IllegalArgumentException("Unrecognized region: " + region);
        };
    }
}
