package core.basesyntax;

import static core.basesyntax.Color.values;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(values().length);
        Color color = values()[index];
        return color.name();
    }
}
