package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random picker = new Random();

    public Color getRandomColor() {
        return Color.values()[picker.nextInt(Color.values().length)];
    }
}
