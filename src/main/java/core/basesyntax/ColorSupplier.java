package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[new Random().nextInt(colors.length)];
    }
}
