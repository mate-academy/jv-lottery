package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    protected String getRandomColor() {
        return Colors.values()[new Random().nextInt(Colors.values().length)].toString();
    }
}
