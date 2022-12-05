package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        final int lengthOfColors = 5;
        Colors values = Colors.values()[random.nextInt(lengthOfColors)];
        return values.toString();
    }
}
