package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public Color getRandomColor() {
        Color[] color = Color.values();
        int randomIndex = random.nextInt(color.length);
        return color[randomIndex];
    }
}
