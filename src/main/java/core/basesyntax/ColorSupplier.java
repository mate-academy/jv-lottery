package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        DifferentColors[] differentColors = DifferentColors.values();
        Random random = new Random();
        int colorSupplier = random.nextInt(differentColors.length);
        return differentColors[colorSupplier].name();
    }
}
