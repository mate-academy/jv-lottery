package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static Colors getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}
