package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
