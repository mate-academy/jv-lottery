package core.basesyntax;

public class ColorSupplier {
    private final int randomColorIndex = (int) (Math.random() * Color.values().length);

    public String getRandomColor() {
        return Color.values()[randomColorIndex].name();
    }
}
