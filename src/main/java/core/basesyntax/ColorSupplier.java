package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        Color[] allColors = Color.values();
        int randomIndex = random.nextInt(allColors.length);
        return allColors[randomIndex];
    }
}