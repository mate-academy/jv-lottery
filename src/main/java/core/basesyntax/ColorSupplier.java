package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)].name();
    }

    public Random getRandom() {
        return random;
    }
}
