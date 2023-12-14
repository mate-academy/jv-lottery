package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        Color[] values = Color.values();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex].name();
    }
}
