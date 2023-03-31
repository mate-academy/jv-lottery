package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor(Random random) {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
