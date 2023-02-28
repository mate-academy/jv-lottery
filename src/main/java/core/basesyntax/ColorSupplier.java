package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int i = new Random().nextInt(colors.length);
        return colors[i].toString();
    }
}
