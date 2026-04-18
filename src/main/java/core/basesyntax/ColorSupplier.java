package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private final Color[] color = Color.values();

    public String getRandomColor() {
        return color[random.nextInt(color.length)].name();
    }
}
