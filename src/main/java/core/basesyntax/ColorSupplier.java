package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        int indexOfColor = new Random().nextInt(Color.values().length);
        return Color.values()[indexOfColor];
    }
}
