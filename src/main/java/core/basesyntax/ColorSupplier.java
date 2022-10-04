package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        int colorNumber = random.nextInt((2) + 1);
        if (colorNumber == 1) {
            return Color.BLACK;
        } else if (colorNumber == 2) {
            return Color.BLUE;
        } else {
            return Color.RED;
        }
    }
}
