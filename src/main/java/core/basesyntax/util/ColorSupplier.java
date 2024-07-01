package core.basesyntax.util;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].toString();
    }
}
