package core.basesyntax;


public class ColorSupplier {
    public Color getRandomColor() {
        return Color.values()[RandomIndex.getRandomIndex(Color.values().length)];
    }
}
