package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
            return randomColors.values()[new Random().nextInt(randomColors.values().length)].toString();
        }
}
