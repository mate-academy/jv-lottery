package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static final int MAGIC_NUMBER = 47;
    private static final Random random = new Random(MAGIC_NUMBER);

    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)].name();
    }
}
