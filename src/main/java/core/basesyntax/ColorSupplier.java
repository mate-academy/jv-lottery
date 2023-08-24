package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {
    private static final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color.name();
    }
}
