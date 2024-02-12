package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        Color color = colors[index];
        return color.toString();
    }
}
