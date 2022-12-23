package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        int color = random.nextInt(Color.values().length);
        return Color.values()[color];
    }
}
