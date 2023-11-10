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

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.toString();
    }
}
