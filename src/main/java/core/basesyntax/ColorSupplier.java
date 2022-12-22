package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        return Colors.values()[random.nextInt(Colors.values().length)].name();
    }
}
