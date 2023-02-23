package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    public static Color getRandomColor() {
        int randomColor = random.nextInt(Color.values().length);
        return Color.values()[randomColor];
    }
}
