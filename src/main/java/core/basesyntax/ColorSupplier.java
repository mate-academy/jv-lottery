package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_AMOUNT = Color.values().length;
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS_AMOUNT);
        return Color.values()[index].name();
    }
}
