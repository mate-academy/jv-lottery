package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randNumbersColors = new Random().nextInt(DifferentColors.values().length);
        DifferentColors differentColors = DifferentColors.values()[randNumbersColors];
        return differentColors.toString();
    }
}
