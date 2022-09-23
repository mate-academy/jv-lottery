package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static Random random;

    public static Color getRandomColor() {
        random = new Random();
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
