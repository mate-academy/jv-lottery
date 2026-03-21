package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] values = Colors.values();
        int index = new Random().nextInt(values.length);
        return values[index].name();
    }
}
