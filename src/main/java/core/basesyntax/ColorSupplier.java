package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {
    public static String getRandomColor() {
        int colorIndex = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values() [colorIndex]);
    }
}
