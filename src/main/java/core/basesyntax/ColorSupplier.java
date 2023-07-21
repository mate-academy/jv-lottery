package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLORS_AMOUNT = Color.values().length;
    private static final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS_AMOUNT);
        return Color.values()[index].name();
    }
}
