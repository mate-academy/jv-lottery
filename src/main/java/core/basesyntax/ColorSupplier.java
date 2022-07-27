package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[(int) (Math.random() * colors.length)].toString();
    }
}
