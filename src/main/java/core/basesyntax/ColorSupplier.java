package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomGenerationEnum = new Random();

    public DifferentColors getRandomColor() {
        int index = randomGenerationEnum.nextInt(DifferentColors.values().length);
        return DifferentColors.values()[index];
    }
}
