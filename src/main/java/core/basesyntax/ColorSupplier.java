package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public Color getRandomColor() {
        int colorNumber = random.nextInt(Color.values().length);
        return Color.values()[colorNumber]
    }
}
