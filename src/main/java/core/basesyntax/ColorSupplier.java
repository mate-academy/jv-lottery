package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();

    public Color getRandomColor() {
        int colorIndex = rand.nextInt(Color.values().length);
        return Color.values()[colorIndex];
    }
}
