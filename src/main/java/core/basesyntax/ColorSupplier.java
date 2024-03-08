package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static public Colors getRandomColor() {
        Colors[] colors = Colors.values();
        int index = new Random().nextInt(colors.length);
        return colors[index];
    }
}
