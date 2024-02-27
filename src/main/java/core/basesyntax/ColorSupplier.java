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

    private final int index = new Random().nextInt(Color.values().length);
    private final Color color = Color.values()[getIndex()];

    public int getIndex() {
        return index;
    }

    public Color getColor() {
        return color;
    }

    public String getRandomColor() {
        return color.toString();
    }
}
