package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Colors getRandomColor() {
        int colorIndex = random.nextInt(Colors.values().length);
        return Colors.values()[colorIndex];
    }
}
