package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random rnd = new Random();

    public Colors getRandomColor() {
        return Colors.values()[rnd.nextInt(Colors.values().length)];
    }
}
