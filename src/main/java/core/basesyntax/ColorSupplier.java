package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        return String.valueOf(ColorsList.values()[random.nextInt(ColorsList.values().length)]);
    }
}
