package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomNum = random.nextInt(colors.length);
        return colors[randomNum];
    }
}
