package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index = new Random().nextInt(Color.values().length);

    public Color getRandomColor() {
        return Color.values()[index];
    }
}
