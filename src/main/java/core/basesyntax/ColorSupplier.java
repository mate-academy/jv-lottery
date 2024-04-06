package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
