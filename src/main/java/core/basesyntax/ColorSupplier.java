package core.basesyntax;

import java.util.Random;

public final class ColorSupplier {
    private static final Color[] colors = Color.values();
    private static final Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(Color.values().length)].name();
    }
}
