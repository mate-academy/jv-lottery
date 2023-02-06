package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        return Colors.values()[RANDOM.nextInt(Colors.values().length)].name();
    }
}
