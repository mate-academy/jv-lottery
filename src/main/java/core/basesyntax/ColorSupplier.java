package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
