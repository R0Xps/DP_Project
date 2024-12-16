package shirts.asia;

import shirts.Shirt;
import shirts.ShirtFactory;

public class AsiaShirtFactory implements ShirtFactory {

    @Override
    public Shirt createShirt(String size) {
        return switch (size) {
            case "small" -> new AsiaSmallShirt();
            case "medium" -> new AsiaMediumShirt();
            case "large" -> new AsiaLargeShirt();
            default -> throw new IllegalArgumentException("Unrecognized size: " + size);
        };
    }
}
