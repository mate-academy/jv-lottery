package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random rand = new Random();

    public Colors getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[rand.nextInt(colors.length)];
    }
}
