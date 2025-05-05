package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomNumber = new Random();

    public Colors getRandomColor() {
        final int index = randomNumber.nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}
