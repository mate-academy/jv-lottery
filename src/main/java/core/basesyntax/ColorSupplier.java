package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        Colors colors = Colors.values()[index];
        return colors.name();

    }
}
