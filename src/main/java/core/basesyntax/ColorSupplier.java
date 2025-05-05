package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] values = Color.values();

    public String getRandomColor() {
        return values[random.nextInt(values.length)].name();
    }
}
