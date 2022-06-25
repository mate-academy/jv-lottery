package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return String.valueOf(Colors.values()[new Random().nextInt(Colors.values().length)]);
    }
}

// implement method String getRandomColor() in class ColorSupplier.
// This method should return a random color, based on the enum values (use Random class for this)