package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    private enum Colors {
        GREEN,
        RED,
        PURPLE,
        BLUE,
        WHITE,
        BLACK
    }

    public String getRandomColor() {
        int choice = random.nextInt(Colors.values().length);
        Colors color = Colors.values()[choice];
        return color.name();
    }
}
