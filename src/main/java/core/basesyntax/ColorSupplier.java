package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        int indexOfRandom = random.nextInt(colors.length);
        return colors[indexOfRandom].toString();
    }
}
