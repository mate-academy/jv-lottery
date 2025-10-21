package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors value = Colors.values()[new Random().nextInt(Colors.values().length)];
        return value.toString();
    }
}
