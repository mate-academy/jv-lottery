package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final String RESET = "\033[0m";
    private final Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
