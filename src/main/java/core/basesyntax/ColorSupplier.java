package core.basesyntax;

import enums.Color;
import java.util.Random;

public class ColorSupplier {
    public final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        int colorIndex = random.nextInt(Color.values().length);
        return Color.values()[colorIndex].toString();
    }
}
