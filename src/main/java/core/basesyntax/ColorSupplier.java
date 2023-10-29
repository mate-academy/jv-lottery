package core.basesyntax;

import core.basesyntax.objects.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int randomColorCode = random.nextInt(Color.values().length);
        Color color = Color.values()[randomColorCode];
        return color.name();
    }
}
