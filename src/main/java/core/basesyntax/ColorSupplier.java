package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random(Color.values().length);
        return Color.values()[random.nextInt()];
    }
}
