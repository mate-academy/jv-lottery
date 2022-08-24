package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    // static is used, because the method getRandomColor() is called without binding
    // to a specific instance of the class
    public static Colors getRandomColor() {
        Random random = new Random();
        return Colors.values()[random.nextInt(Colors.values().length)];
    }
}
