package core.basesyntax;

public class ColorSupplier {

    public Colors getRandomColor() {
        return Colors.values()[(int) (Math.random() * Colors.values().length)];
    }
}
