package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Colors getRandomColor() {

        final Random random = new Random();
        final Colors[] colors = Colors.values();
        final int RandomIndex = random.nextInt(colors.length);
        return colors[RandomIndex];
    }
}
