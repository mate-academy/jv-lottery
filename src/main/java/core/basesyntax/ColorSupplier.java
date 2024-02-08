package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors color = Colors.values()[new Random().nextInt(Colors.values().length)];
        return color.toString();
    }
}
