package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static color getRandomColor() {
        int index = new Random().nextInt(color.values().length);
        return color.values()[index];
    }
}
