package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Random RANDOM = new Random();
    private final Colors[] colors = Colors.values();

    public String getRandomColor() {
        return colors[RANDOM.nextInt(colors.length)].name();
    }
}
