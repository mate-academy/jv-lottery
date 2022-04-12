package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Color[] colors = Color.values();
    Random random = new Random();

    public Color getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
