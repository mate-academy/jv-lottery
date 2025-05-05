package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public final Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }

}
