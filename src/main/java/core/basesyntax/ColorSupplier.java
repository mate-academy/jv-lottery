package core.basesyntax;

public class ColorSupplier {
    public Color getRandomColor() {
        int index = Lottery.RANDOM.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
