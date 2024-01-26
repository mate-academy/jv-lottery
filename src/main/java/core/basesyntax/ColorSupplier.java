package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public String getRandomColor() {
        Color[] values = Color.values();
        int index = random.nextInt(values.length);
        return values[index].toString();
    }
}
