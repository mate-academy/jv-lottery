package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random RANDOM = new Random();

    private enum Colors {
        RED, ORANGE, YELLOW, GREEN, LIGHT_BLUE, BLUE, VIOLET
    }

    public String getRandomColor() {
        return Colors.values()[RANDOM.nextInt(Colors.values().length)].name();
    }
}
