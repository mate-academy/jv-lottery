package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final String RESET = "\033[0m";

    public Color getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }
}
