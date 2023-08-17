package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] colors = Color.values();
    private static final int bound = colors.length;
    private static Random random = new Random();
    public static String getRandomColor() {
        int index = random.nextInt(bound);
        return String.valueOf(colors[index]);
    }
}
