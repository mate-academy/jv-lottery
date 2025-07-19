package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Color[] colors = Color.values();
        int number = new Random().nextInt(colors.length);
        return colors[number];
    }
}
