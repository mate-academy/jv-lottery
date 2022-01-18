package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color[] values = Color.values();
        return String.valueOf(values[random.nextInt(values.length)]);
    }
}
