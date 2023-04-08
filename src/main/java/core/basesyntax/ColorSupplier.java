package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        Random RANDOM = new Random();
        Color[] colors = Color.values();
        int index = RANDOM.nextInt(colors.length);
        return colors[index];
    }
}
