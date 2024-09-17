package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
