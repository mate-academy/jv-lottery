package core.basesyntax;

public class ColorSupplier {
    public Color getRandomColor() {
        Random rand = new Random();
        int indexColor = rand.nextInt(Color.values().length
        return Color.values()[indexColor];
    }
}
