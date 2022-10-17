package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        int colorNumber = new Random().nextInt(Color.values().length);
        return Color.valueOf(Color.values()[colorNumber].name());
    }
}
