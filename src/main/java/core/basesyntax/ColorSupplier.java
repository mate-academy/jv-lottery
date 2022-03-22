package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Colors getRandomColor() {
        int color = new Random().nextInt(Colors.values().length);
        return Colors.values()[color];
    }
}
