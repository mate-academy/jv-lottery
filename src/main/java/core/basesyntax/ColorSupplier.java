package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Random random = new Random();
        Colors[] values = Colors.values();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex];
    }
}
