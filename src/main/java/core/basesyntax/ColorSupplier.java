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
    int index = new Random().nextInt(Color.values().length);
    Color color = Color.values()[index];
    public String getRandomColor() {
        return color.toString();
    }
}
