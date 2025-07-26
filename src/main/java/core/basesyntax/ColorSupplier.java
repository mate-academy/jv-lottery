package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        final Random rand = new Random();
        Color[] colors = Color.values();
        int randIndex = rand.nextInt(colors.length);
        return colors[randIndex];
    }
}
