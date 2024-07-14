package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final Color[] COLORS = Color.values();

    public Color getRandomColor() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}
