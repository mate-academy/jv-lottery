package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class ColorSupplier {
    private final Random r = new Random();

    public Color getRandomColor() {
        return Color.values()[r.nextInt(Color.values().length)];
    }
}
