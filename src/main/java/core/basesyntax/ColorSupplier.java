package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Color[] values = Color.values();
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}
