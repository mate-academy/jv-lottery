package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public enum Colors {
        RED,
        YELLOW,
        WHITE,
        BLACK,
        BLUE
    }

    private final Random random = new Random();

    public String getRandomColor() {
        return Colors.values()[random.nextInt(Colors.values().length)].name();
    }
}
