package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Random random = new Random();
    private final Colors[] colors = Colors.values();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].name();
    }
}
