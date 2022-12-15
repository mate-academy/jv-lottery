package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLOR = Color.values().length;
    private Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(NUMBER_OF_COLOR)].name();
    }
}
