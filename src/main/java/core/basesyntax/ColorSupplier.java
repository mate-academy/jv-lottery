package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }
}
