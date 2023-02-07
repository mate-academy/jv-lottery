package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public final Color getRandomColor() {
        final int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];

    }
}
