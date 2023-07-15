package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Color {
        YELLOW,
        GREEN,
        BLACK,
        BLUE,
        PINK,
        PURPLE,
        RED,
        WHITE,
        ORANGE
    }

    private static final int COLOR_COUNT = 9;

    public String getRandomColor() {
        return Color.values()[new Random().nextInt(COLOR_COUNT)].name();
    }
}
