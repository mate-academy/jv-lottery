package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        int colorIndex = new Random().nextInt(Color.values().length);
        return Color.values()[colorIndex];
    }
}
