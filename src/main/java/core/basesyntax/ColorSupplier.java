package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int randColorNumber = random.nextInt(Color.values().length);
        return Color.values()[randColorNumber].name();
    }

    private enum Color {
        RED,
        BLUE,
        GREEN,
        WHITE,
        BLACK,
        ORANGE,
        PURPLE
    }
}
