package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random;

    static {
        random = new Random();
    }

    public String getRandomColor() {
        int colorIndex = random.nextInt(Colors.values().length);
        return Colors.values()[colorIndex].toString();
    }
}
