package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public String getRandomColor() {
        int index = getRandom().nextInt(Colors.values().length);
        return Colors.values()[index].name();
    }
}