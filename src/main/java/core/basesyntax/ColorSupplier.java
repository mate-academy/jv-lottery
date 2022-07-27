package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = new Colors[] { Colors.RED, Colors.GREEN, Colors.BLUE, Colors.YELLOW };
        return colors[(int)( Math.random() * 4)].toString();
    }
}
