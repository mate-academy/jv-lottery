package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {
    private final Random randomColor = new Random();

    public DifferentColors getRandomColor() {
        int index = randomColor.nextInt(DifferentColors.values().length);
        return DifferentColors.values()[index];
    }
}
