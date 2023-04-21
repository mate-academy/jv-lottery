package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static Color.ColorOptions getRandomColor() {
        int randomIndex = random.nextInt(Color.ColorOptions.values().length);
        return Color.ColorOptions.values()[randomIndex];
    }
}
