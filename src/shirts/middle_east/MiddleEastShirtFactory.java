package shirts.middle_east;

import shirts.Shirt;
import shirts.ShirtFactory;

public class MiddleEastShirtFactory implements ShirtFactory {

    @Override
    public Shirt createShirt(String size) {
        return switch(size) {
            case "small" -> new MiddleEastSmallShirt();
            case "medium" -> new MiddleEastMediumShirt();
            case "large" -> new MiddleEastLargeShirt();
            default -> throw new IllegalArgumentException("Unrecognized size: " + size);
        };
    }
}
