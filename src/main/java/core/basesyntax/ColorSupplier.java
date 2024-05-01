package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        Color[] color = Color.values();
        int randomIndex = random.nextInt(color.length);
        return color[randomIndex];
    }
}
