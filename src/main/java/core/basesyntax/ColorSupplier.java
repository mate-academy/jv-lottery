package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int indexOfRandom = random.nextInt(colors.length);
        return colors[indexOfRandom].toString();
    }
}
