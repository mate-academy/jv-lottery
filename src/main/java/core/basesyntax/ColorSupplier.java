package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public Colors getRandomColor() {
        return Colors.values()[new Random().nextInt(Colors.values().length)];
    }
}
