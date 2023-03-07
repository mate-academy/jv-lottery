package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_INDEX = Color.values().length;

    public Color getRandomColor() {
        int index = new Random().nextInt(MAX_INDEX);
        return Color.values()[index];
    }
}
