package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColor = new Random();

    public Colors getRandomColor() {
        return Colors.values()[randomColor.nextInt(Colors.values().length)];
    }
}
