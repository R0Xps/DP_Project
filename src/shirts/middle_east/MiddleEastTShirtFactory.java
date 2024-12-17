package shirts.middle_east;

import shirts.TShirt;
import shirts.TShirtFactory;

public class MiddleEastTShirtFactory implements TShirtFactory {

    @Override
    public TShirt createShirt(String size) {
        return switch(size) {
            case "small" -> new MiddleEastSmallTShirt();
            case "medium" -> new MiddleEastMediumTShirt();
            case "large" -> new MiddleEastLargeTShirt();
            default -> throw new IllegalArgumentException("Unrecognized size: " + size);
        };
    }
}
