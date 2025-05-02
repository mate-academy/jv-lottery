package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }
}
