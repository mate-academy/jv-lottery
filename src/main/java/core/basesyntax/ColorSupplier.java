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

    public static String getRandomColor() {
        Random random = new Random();
        return String.valueOf(Color.values()[random.nextInt(9)]);
    }
}
