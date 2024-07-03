package core.basesyntax.util;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Color[] colors = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index].name();
    }
}
