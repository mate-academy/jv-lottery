package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static int intRandom() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }

}
