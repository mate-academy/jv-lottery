package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getRandomColor() {

        Color[] colors = Color.values();
        random = new Random();
        return colors[random.nextInt(colors.length)].name();
    }
}
