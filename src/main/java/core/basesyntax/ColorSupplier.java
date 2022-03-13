package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(ColorSet.values().length);
        return ColorSet.values()[index].toString();
    }
}
