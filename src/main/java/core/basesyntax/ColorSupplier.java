package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    Color [] colors = Color.values();

    public Color getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
