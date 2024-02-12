package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random color = new Random();

    public Color getRandomColor() {
        int index = color.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
