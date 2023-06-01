package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int RANDOM_NUMBER_BOUND = 9;
    private final Random random = new Random();
    public String getRandomColor() {
        return Colors.values()[random.nextInt(Colors.values().length)].toString();
    }
    public int getRandomInt() {
        return random.nextInt(RANDOM_NUMBER_BOUND);
    }

}
