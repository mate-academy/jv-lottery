package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] values = Colors.values();
        int randomInt = new Random().nextInt(values.length);
        return values[randomInt].name();
    }
}
