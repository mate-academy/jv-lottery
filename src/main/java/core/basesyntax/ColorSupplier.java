package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public static Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
