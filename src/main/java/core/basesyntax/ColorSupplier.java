package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        return colors[random.nextInt(10)].name();
    }
}
