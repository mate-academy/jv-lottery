package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_AMOUNT = Colors.values().length;
    private Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int index = random.nextInt(COLORS_AMOUNT);
        return Colors.values()[index].toString();
    }
}
