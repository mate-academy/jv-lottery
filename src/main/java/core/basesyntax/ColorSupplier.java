package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
