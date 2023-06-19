package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.toString();
    }
}
