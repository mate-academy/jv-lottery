package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random r = new Random();

    public static Color getRandomColor() {
        return Color.values()[r.nextInt(Color.values().length)];
    }
}
