package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public Colors getRandomColor() {
        int result = random.nextInt(Colors.values().length);
        return Colors.values()[result];
    }
}
