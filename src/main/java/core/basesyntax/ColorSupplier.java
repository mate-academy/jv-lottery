package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}
