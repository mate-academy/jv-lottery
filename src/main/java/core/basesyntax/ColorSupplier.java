package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_NUM = Color.values().length;
    private Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(COLORS_NUM)].toString();
    }
}
