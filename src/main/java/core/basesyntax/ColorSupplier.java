package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return "" + DifferentColors.values()[new Random().nextInt(DifferentColors.values().length)];
    }
}
