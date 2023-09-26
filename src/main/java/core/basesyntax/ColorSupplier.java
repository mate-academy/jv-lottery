package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] values = Color.values();

    public Color getRandomColor() {
        int index = random.nextInt(values.length);
        return values[index];
    }
}
