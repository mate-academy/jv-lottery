package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        Color someColor = Color.values()[random.nextInt(Color.values().length)];
        return someColor.name();
    }
}
