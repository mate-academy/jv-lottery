package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        return Colors.values()[getRandomIndexOfColors()].toString();
    }

    private int getRandomIndexOfColors() {
        return (int) (Math.random() * Colors.values().length);
    }
}
