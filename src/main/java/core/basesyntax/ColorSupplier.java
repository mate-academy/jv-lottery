package core.basesyntax;

import java.util.Random;

import static core.basesyntax.Color.*;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(values().length);
        Color color = values()[index];
        return color.name();
    }
}
