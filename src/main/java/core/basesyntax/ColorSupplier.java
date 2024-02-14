package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int randomIdx = random.nextInt(Color.values().length);

        return Color.values()[randomIdx].name();
    }
}
