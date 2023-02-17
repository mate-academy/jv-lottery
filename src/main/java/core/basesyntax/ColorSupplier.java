package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static Colors getRandomColor() {
        Colors[] colors = Colors.values();
        int index = random.nextInt(colors.length);
        return colors[index];
        }
    }

