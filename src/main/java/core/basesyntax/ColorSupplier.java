package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int colorCount = Color.values().length;
        int index = new Random().nextInt(colorCount);
        Color color = Color.values()[index];
        return color.toString();
    }
}
