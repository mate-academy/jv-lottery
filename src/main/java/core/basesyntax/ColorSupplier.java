package core.basesyntax;

import java.util.Arrays;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[new Random().nextInt(colors.length)].toString();
    }
}
