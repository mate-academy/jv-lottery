package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int color = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[color]);
    }
}
