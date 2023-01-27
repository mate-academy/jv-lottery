package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public enum Color {
        GREEN,
        RED,
        WHITE,
        BLACK,
        YELLOW,
        BLUE,
        PINK
    }

    public Color getRandomColor() {
        int i = random.nextInt(Color.values().length);
        return Color.values()[i];
    }
}
