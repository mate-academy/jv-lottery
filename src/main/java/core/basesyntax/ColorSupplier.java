package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static differentColor getRandomColor() {
        int index = new Random().nextInt(differentColor.values().length);
        return differentColor.values()[index];
    }
}
