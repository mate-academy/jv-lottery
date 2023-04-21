package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public Colors getRandomColor() {
        int randomize = random.nextInt(Colors.values().length);
        return Colors.values()[randomize];
    }
}
