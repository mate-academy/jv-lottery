package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor(Random random) {
        return Color.values()[random.nextInt(Color.values().length)].toString();
    }
}
