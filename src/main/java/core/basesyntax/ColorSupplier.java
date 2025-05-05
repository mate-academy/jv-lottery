package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
