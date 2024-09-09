package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int RANDOM_BOUND = Color.values().length;
    private Random randomColor = new Random();

    public String getRandomColor() {
        int index = randomColor.nextInt(RANDOM_BOUND);
        return Color.values()[index].toString();
    }
}
