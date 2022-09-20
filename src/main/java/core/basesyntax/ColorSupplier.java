package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int pick = new Random().nextInt(DifferentColors.values().length);
        return DifferentColors.values()[pick].toString();
    }
}
