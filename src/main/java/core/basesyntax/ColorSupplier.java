package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public enum Color {
        BLACK,
        WHITE,
        RED,
        BLUE,
        GREEN,
        YELLOW
    }

    public static Color getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
