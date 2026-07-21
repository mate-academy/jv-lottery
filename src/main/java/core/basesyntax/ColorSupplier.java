package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}

