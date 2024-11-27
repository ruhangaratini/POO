package Pizzaria.model;

public enum PizzaSize {
    SMALL,
    MEDIUM,
    BIG;

    @Override
    public String toString() {
        return switch (this) {
            case SMALL -> "PEQUENA";
            case MEDIUM -> "MEDIA";
            case BIG -> "GRANDE";
        };
    }
}
