package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    protected static Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}
