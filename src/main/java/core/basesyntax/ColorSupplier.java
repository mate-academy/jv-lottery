package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomForColor;

    public ColorSupplier() {
        this.randomForColor = new Random();
    }

    public Colors getRandomColor() {
        return Colors.values()[randomForColor.nextInt(Colors.values().length)];
    }
}
