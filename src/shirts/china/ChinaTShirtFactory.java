package shirts.china;

import shirts.TShirt;
import shirts.TShirtFactory;

public class ChinaTShirtFactory implements TShirtFactory {

    @Override
    public TShirt createShirt(String size) {
        return switch(size) {
            case "small" -> new ChinaSmallTShirt();
            case "medium" -> new ChinaMediumTShirt();
            case "large" -> new ChinaLargeTShirt();
            default -> throw new IllegalArgumentException("Unrecognized size: " + size);
        };
    }
}
