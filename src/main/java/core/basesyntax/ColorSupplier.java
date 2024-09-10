package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int RANDOM_BOUND = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(RANDOM_BOUND);
        return Color.values()[index].name();
    }
}
