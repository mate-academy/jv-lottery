package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int randNumbersColors = random.nextInt(DifferentColors.values().length);
        DifferentColors differentColors = DifferentColors.values()[randNumbersColors];
        return differentColors.toString();
    }
}
