package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;
    private final Color[] colors;

    public ColorSupplier(Random random, Color[] colors) {
        this.random = random;
        this.colors = colors;
    }

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index].toString();
    }
}
