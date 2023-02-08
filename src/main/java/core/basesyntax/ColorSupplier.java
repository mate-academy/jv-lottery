package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private int numberOfColor = random.nextInt(Color.values().length);

    public Color getRandomColor() {
        return Color.values()[numberOfColor];
    }
}
