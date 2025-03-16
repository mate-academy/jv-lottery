package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        ORANGE
    }

    public String getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
