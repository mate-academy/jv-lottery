package core.basesyntax;

import java.util.Random;


public class ColorSupplier {
    public static Color getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
