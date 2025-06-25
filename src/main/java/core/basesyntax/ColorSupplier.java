package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    // Повертаємо випадковий колір із перелічених значень enum Color
    public Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }
}
