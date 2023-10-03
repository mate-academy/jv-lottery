package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    Color[] colors = Color.values();
    public Color getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
