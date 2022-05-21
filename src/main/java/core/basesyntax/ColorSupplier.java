package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}

