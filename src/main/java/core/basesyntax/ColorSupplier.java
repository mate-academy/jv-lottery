package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int result = new Random().nextInt(DifferentColors.values().length);
        return String.valueOf(DifferentColors.values()[result]);
    }
}
