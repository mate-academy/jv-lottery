package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static COLOR getRandomColor() {
        return COLOR.values()[new Random().nextInt(COLOR.values().length)];
    }
}
