package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] colors = Color.values();
    private final Random random = new Random();

    public Color getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
