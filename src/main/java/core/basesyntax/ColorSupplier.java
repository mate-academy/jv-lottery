package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(DifferentColors.values().length);
        return DifferentColors.values()[index].name();
    }
}
