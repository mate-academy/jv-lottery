package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        int randomNum = random.nextInt(colors.length);
        return colors[randomNum];
    }
}
