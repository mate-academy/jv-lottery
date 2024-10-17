package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    protected static Random random = new Random();

    public Colors getRandomColor() {
        return Colors.values()[random.nextInt(Colors.values().length)];
    }
}
