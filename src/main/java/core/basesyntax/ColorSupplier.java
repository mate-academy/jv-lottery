package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public DifferentColors getRandomColor() {
        int index = new Random().nextInt(DifferentColors.values().length);
        return DifferentColors.values()[index];
    }
}
