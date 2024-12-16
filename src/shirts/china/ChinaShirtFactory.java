package shirts.china;

import shirts.Shirt;
import shirts.ShirtFactory;

public class ChinaShirtFactory implements ShirtFactory {

    @Override
    public Shirt createShirt(String size) {
        return switch(size) {
            case "small" -> new ChinaSmallShirt();
            case "medium" -> new ChinaMediumShirt();
            case "large" -> new ChinaLargeShirt();
            default -> throw new IllegalArgumentException("Unrecognized size: " + size);
        };
    }
}
