package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    private enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        ORANGE,
        PURPLE,
        BLACK,
        WHITE
    }

    public String getRandomColor() {
        Color[] colors = Color.values();
        int index = RANDOM.nextInt(colors.length);

        return colors[index].name();
    }
}
