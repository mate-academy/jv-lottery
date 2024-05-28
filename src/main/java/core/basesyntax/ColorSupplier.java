package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        ORANGE
    }

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
