package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        Color[] colors = Color.values();
        int index = new Random().nextInt(Color.values().length);
        return colors[index];
    }
}
