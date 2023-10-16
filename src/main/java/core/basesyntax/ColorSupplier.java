package core.basesyntax;

public class ColorSupplier {
    private final RandomSupplier randomSupplier = new RandomSupplier();

    public String getRandomColor() {
        return String.valueOf(Color.values()[randomSupplier.getRandomValue(Color.values().length)]);
    }
}
