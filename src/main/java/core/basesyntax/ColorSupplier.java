package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static Color getRandomColor() {
        Color[] color = Color.values();
        int randomIndex = random.nextInt(color.length);

        return color[randomIndex];
    }
}
