package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = Color.values().length;
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(NUMBER_OF_COLORS);
        return String.valueOf(Color.values()[index]);
    }
}
