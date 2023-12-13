package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Colors[] values = Colors.values();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex].toString();
    }
}
