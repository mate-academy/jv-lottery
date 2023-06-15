package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        int rnd = new Random().nextInt(Color.values().length);
        return Color.values()[rnd];
    }
}
