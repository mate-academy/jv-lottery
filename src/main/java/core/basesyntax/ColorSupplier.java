package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private static final Random random = new Random();

    public static Color getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}