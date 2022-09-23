package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();;

    public static Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
