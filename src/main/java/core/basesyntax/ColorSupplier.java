package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int index = Color.values().length;
        return colors[random.nextInt(index)];
    }
}
