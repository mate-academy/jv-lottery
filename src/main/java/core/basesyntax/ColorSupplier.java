package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();
    private int index = RANDOM.nextInt(Colors.values().length);

    public String getRandomColor() {
        return Colors.values()[index].toString();
    }
}
