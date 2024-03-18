package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final Color[] colors = Color.values();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].name();
    }
}
