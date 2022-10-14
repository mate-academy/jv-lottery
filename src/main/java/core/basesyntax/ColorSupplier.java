package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] color = Color.values();

    public Color getRandomColor() {
        int colorNumber = random.nextInt(Color.values().length);
        return color[colorNumber];
    }
}
