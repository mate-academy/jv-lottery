package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static final int COLOR_NUMBER = 3;
    private final Random random = new Random();

    public Color getRandomColor() {
        int colorNumber = random.nextInt(COLOR_NUMBER);
        if (colorNumber == 1) {
            return Color.BLACK;
        } else if (colorNumber == 2) {
            return Color.BLUE;
        } else {
            return Color.RED;
        }
    }
}
