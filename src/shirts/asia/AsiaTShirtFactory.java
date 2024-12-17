package shirts.asia;

import shirts.TShirt;
import shirts.TShirtFactory;

public class AsiaTShirtFactory implements TShirtFactory {

    @Override
    public TShirt createShirt(String size) {
        return switch (size) {
            case "small" -> new AsiaSmallTShirt();
            case "medium" -> new AsiaMediumTShirt();
            case "large" -> new AsiaLargeTShirt();
            default -> throw new IllegalArgumentException("Unrecognized size: " + size);
        };
    }
}
