package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[new Random().nextInt(Colors.values().length)].toString();
    }
}
