package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public static Colors getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color;
    }
}
