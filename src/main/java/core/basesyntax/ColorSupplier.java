package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private Colors[] values = Colors.values();

    public String getRandomColor() {
        int index = random.nextInt(values.length);
        Colors color = values[index];
        return color.name();
    }
}
