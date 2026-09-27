package core.basesyntax;

import java.util.Random;
import model.Color;

public class ColorSupplier {

    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public Random getRandom() {
        return this.random;
    }

    public Color getRandomColor() {
        int index = this.random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
