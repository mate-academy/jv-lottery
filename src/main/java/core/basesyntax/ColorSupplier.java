package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Random randomColor = new Random();
        return Color.values()[index];
    }
}

