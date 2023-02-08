package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public Colors getRandomColor() {
        int randomColor = random.nextInt(Colors.values().length);
        return Colors.values()[randomColor];
    }
}
