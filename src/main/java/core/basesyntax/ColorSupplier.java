package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        int index = RANDOM.nextInt(Colors.values().length);
        return Colors.values()[index].name();
    }
}
