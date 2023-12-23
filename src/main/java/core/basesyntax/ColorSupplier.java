package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        Colors[] values = Colors.values();
        int randomIndex = random.nextInt(values.length);
        Colors randomColor = values[randomIndex];
        return randomColor.toString();
    }
}
