package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        int colorInt = RANDOM.nextInt(Colors.values().length);
        Colors colorRandom = Colors.values()[colorInt];
        return colorRandom.name();
    }
}
