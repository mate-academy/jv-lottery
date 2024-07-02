package core.basesyntax.util;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_QUANTITY = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        Color randomColor = Color.values()[random.nextInt(COLOR_QUANTITY)];
        return randomColor.toString();
    }
}
