package core.basesyntax;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = Random.getRandomColorIndex();
        return Color.values()[index].name();
    }
}
