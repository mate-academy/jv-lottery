package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public DiffColor getRandomColor() {
        return DiffColor.values()[random.nextInt(DiffColor.values().length)];
    }
}
