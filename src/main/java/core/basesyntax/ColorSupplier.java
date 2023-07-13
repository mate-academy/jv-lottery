package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Color color = Color.values()[new Random().nextInt(Color.values().length)];
        return color;
    }
}
