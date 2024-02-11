package core.basesyntax;

import enums.Colors;
import java.util.Random;

public class ColorSupplier {
    public final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        int colorIndex = random.nextInt(Colors.values().length);
        return Colors.values()[colorIndex].toString();
    }
}
