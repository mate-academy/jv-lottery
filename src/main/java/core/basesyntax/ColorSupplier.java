package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random RANDOM = new Random();
    private final int SIZE = Colors.values().length;
    public String getRandomColor() {

        int position = RANDOM.nextInt(SIZE);
        return Colors.values()[position].name();
    }
}
