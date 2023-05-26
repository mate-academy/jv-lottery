package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] color = Colors.values();
        return color[new Random().nextInt(color.length)].toString();
    }
}
