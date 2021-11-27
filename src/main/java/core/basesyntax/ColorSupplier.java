package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(Colour.values().length);
        return Colour.values()[index].toString();
    }
}
