package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Colors getRandomColor() {
        Colors[] color = Colors.values();
        int index = Colors.values().length;
        return color[random.nextInt(index)];
    }
}
