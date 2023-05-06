package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(Colours.values().length);
        return String.valueOf(Colours.values()[index]);
    }
}
