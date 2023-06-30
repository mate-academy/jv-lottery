package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        int colorsBound = Color.values().length;
        int index = random.nextInt(colorsBound);
        return Color.values()[index];
    }
}
