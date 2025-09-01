package core.basesyntax.service;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);

        return Color.values()[index];
    }
}
