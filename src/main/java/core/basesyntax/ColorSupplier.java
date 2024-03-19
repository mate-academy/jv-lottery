package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] colors = Color.values();

    public static Color getRandomColor() {
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);

        return colors[randomIndex];
    }
}
