package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color color;

    public ColorSupplier() {
        int index = new Random().nextInt(Color.values().length);
        this.color = Color.values()[index];
    }

    public String getRandomColor() {
        return color.toString();
    }

    enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        ORANGE
    }
}
