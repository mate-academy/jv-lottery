package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] colors;
    private final Random random;

    public ColorSupplier(Random random, Colors[] colors) {
        this.random = random;
        this.colors = colors;
    }

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].toString();
    }
}
