package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        return Colors.values()[(int) (Math.random()*Colors.values().length)].toString();
    }
}
