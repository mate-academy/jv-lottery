package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    int picker = new Random().nextInt(Color.values().length);

    public Color getRandomColor() {
        return Color.values()[picker];
    }
}
