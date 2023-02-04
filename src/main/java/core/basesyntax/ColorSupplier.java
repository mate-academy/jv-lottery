package core.basesyntax;

public class ColorSupplier {
    private final Random random = new Random();
    public String getRandomColor() {
        int index = random.getRandomColorIndex();
        return Color.values()[index].name();
    }
}
