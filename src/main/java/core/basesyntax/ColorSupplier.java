package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public static String getRandomColor() {
        int colorIndex = new Random().nextInt(Colors.values().length);
        Colors str = Colors.values()[colorIndex];
        return str.name();
    }
}
