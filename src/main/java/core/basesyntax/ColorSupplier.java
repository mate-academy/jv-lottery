package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Colors[] color = Colors.values();

    public Colors getRandomColor() {

        return color[random.nextInt(color.length)];
    }
}
