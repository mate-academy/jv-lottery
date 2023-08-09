package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = Lottery.RANDOM;

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
