package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Color {
        RED,
        BLUE,
        PURPLE,
        YELLOW,
        BLACK,
        ORANGE,
        WHITE
    }

    private final Random randomColor = new Random();

    public String getRandomColor() {
        int index = randomColor.nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.name();
    }
}
