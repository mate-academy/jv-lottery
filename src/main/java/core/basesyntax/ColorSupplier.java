package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final Random random = new Random();

    public String getRandomColor() {
        int colors = random.nextInt(Colors.values().length);
        return Colors.values()[colors].name();
    }
}
