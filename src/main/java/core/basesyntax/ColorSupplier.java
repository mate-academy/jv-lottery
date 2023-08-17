package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private static final int COLORS_AMOUNT = COLORS.length;
    private Random random = new Random();

    public Random getRandom() {
        return this.random;
    }

    public String getRandomColor() {
        int index = random.nextInt(COLORS_AMOUNT);
        return COLORS[index].name().toLowerCase();
    }
}
