package shirts;

public abstract class TShirt {
    private String name;
    private String description;

    public TShirt() {
        name = "Regular T-Shirt";
        description = "Regular T-Shirt that comes in many sizes";
    }

    public String getDescription() {
        return name + ", " + description;
    }

    public abstract void formSize();
}