package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static Random random = new Random();
    public Colors getRandomColor() {
        Colors color = Colors.values()[random.nextInt(Colors.values().length)];
        return color;
    }
}
