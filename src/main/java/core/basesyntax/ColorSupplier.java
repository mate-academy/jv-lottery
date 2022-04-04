package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] values = Color.values();
        return values[SingletonRandom.getInstance().nextInt(values.length)].name();
    }
}
