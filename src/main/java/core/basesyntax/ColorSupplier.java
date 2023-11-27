package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        int colorIndex = random.nextInt(0, colors.length);
        return colors[colorIndex];
    }
}
