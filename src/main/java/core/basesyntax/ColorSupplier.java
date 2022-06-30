package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public enum Color {
        GREEN,
        RED,
        YELLOW
    }

    private Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
