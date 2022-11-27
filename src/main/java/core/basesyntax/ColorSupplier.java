package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int SIZE = Colors.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int position = random.nextInt(SIZE);
        return Colors.values()[position].name();
    }
}
