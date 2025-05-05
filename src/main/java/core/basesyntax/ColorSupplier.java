package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int index = new Random().nextInt(colors.length);
        return String.valueOf(colors[index]);
    }
}
