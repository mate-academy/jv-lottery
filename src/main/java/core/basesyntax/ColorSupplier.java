package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private enum Colors {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        ORANGE
    }

    public String getRandomColor() {
        return Colors.values()[new Random().nextInt(Colors.values().length)].name();
    }
}
