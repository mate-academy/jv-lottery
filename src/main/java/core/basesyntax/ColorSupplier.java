package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(DifferentColors.values().length);
        DifferentColors ballColor = DifferentColors.values()[index];
        return ballColor.toString();
    }
}
