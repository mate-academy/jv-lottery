package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Color[] colors = Color.values();
        int index = new Random().nextInt(colors.length);
        return Color.values()[index];
    }
}
