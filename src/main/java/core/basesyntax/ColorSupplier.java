package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index = new Random().nextInt(Colors.values().length);

    public Colors getRandomColor() {
        return Colors.values()[index];
    }
}
