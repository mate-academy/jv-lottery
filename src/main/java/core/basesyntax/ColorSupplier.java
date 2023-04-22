package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int resultColor = random.nextInt(DifferentColors.values().length);
        return String.valueOf(DifferentColors.values()[resultColor]);
    }
}
