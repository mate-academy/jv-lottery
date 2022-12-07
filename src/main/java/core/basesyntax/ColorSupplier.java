package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        final int lengthOfColors = Color.values().length;
        Color values = Color.values()[random.nextInt(lengthOfColors)];
        return values.name();
    }
}
