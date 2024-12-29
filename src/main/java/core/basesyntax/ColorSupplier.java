package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int picker = new Random().nextInt(Color.values().length);

    public Color getRandomColor() {
        return Color.values()[picker];
    }
}
