package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        return String.valueOf(Color.values()[random.nextInt(Color.values().length)]);
    }
}
