package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        int randomColorNumber = random.nextInt(ColorsEnum.values().length);
        return ColorsEnum.values()[randomColorNumber].toString();
    }

    public Random getRandom() {
        return random;
    }
}
