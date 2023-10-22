package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index;

    public Color getRandomColor() {
        index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}
