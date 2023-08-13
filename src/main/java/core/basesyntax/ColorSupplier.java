package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Color[] values = Color.values();
        int length = values.length;
        int randIndex = random.nextInt(length);
        Color colors = values[randIndex];
        return colors.name();
    }
}
