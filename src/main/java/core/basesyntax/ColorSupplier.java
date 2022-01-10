package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public void setRandom(Random random) {
        this.random = random;
    }

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
