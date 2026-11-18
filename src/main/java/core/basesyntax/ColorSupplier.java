package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        int randomInt = random.nextInt(colors.length);
        return colors[randomInt];
    }
}
