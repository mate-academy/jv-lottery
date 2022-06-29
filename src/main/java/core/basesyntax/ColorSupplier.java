package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    enum Color {
        Green,
        Red,
        Yellow
    }

    public Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}
