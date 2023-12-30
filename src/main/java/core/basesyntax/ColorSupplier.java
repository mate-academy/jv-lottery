package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int numberOfColors = 3;
    private final Random random = new Random();

    public String getRandomColor() {
        return Colors.values()[random.nextInt(numberOfColors)].name();
    }
}
