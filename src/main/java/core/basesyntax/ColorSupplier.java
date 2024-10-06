package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Color color = Color.values()[new Random().nextInt(Color.values().length)];
        return color.toString();
    }
}
