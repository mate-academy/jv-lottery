package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = RANDOM.nextInt(colors.length);
        return colors[randomIndex];
    }

    public enum Color {
        RED, GREEN, BLUE, YELLOW, ORANGE;
    }
}
