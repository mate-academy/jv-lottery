package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int colorCount = Color.values().length;
        int index = this.random.nextInt(colorCount);
        Color color = Color.values()[index];
        return color.toString();
    }
}
