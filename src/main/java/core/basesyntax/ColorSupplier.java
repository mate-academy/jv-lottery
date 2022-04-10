package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Colors { WHITE, YELLOW, ORANGE, RED, MAGENTA, GREEN, BLUE, PINK, BLACK }

    private static Random random = new Random();

    public static int getRandom(int numberOfVariants) {
        return random.nextInt(numberOfVariants);
    }

    public static String getRandomColor() {
        return Colors.values()[getRandom(Colors.values().length)].name();
    }
}
