package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static DifferentColor getRandomColor() {
        int index = new Random().nextInt(DifferentColor.values().length);
        return DifferentColor.values()[index];
    }
}
