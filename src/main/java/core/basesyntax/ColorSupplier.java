package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        return String.valueOf(Color.values()[(int) (Math.random() * Color.values().length)]);
    }
}
