package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int colorIndex = new Random().nextInt(Colors.values().length);
        Colors str = Colors.values()[colorIndex];
        return str.name();
    }
}
